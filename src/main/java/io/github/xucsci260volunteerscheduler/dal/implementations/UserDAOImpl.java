package io.github.xucsci260volunteerscheduler.dal.implementations;

import io.github.xucsci260volunteerscheduler.dal.interfaces.UserDAO;
import io.github.xucsci260volunteerscheduler.domain.User;
import io.github.xucsci260volunteerscheduler.domain.requests.CreateUserRequest;
import io.github.xucsci260volunteerscheduler.domain.requests.GetUserRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The file UserDAOImpl.java was created by Chris on 1:07 PM at 3/17/2018
 */
 @Component
 public class UserDAOImpl implements UserDAO {

     private JdbcTemplate jdbcTemplate;

     public UserDAOImpl(JdbcTemplate jdbcTemplate) {
         this.jdbcTemplate = jdbcTemplate;
     }

    /**
     * query database for all users
     *
     * @return List of all users in database
     */
    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT ALL FROM USERTABLE";

        return jdbcTemplate.query(sql,
                (rs, rowNum) ->
                    new User(rs.getString("U_DOB"),
                             rs.getString("U_USERNAME"),
                             rs.getString("U_EMAIL"),
                             rs.getString("U_FIRSTNAME"),
                             rs.getString("U_LASTNAME"),
                             rs.getString("U_PASSWORD")));
    }

    /**
     * query database for specific user
     *
     * @param request GetUserRequest object
     * @return user from database
     */
    @Override
    public User getUser(GetUserRequest request) {
        User u;

        switch (request.getMethod()) {
            case EMAIL:
                u = getUserEmail(request.getEmail());
                break;
            /*case USERNAME:
                u = getUserUsername();
                break;*/
            default:
                throw new IndexOutOfBoundsException("Invalid Request");
        }

        return u;
    }

    private User getUserEmail(String email) {
        String sql = "SELECT * FROM USERTABLE WHERE U_EMAIL = " + email;

        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
        User u;

        if (users.size() == 0) {
            u = null;
        } else {
            u = users.get(0);
        }

        return u;
    }

  /*  private User getUserUsername(String username) {
        String sql = "SELECT * FROM USERTABLE WHERE U_USERNAME ALL =  " + username;


        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
        User u;

        if (users.size() == 0) {
            u = null;
        } else {
            u = users.get(0);
        }

        return u;
    }*/

    /**
     * insert user into database
     *
     * @param u CreateUserRequest object
     * @return newly created user
     */
    @Override
    public User createUser(User u) {
        String sql = "INSERT INTO USERTABLE (U_USERNAME, U_EMAIL, U_FIRSTNAME, U_LASTNAME, U_DOB, U_PASSWORD) VALUES ( ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                u.getUsername(),
                u.getEmail(),
                u.getFirstName(),
                u.getLastName(),
                u.getDob(),
                u.getPassword());

        return u;
    }


}
