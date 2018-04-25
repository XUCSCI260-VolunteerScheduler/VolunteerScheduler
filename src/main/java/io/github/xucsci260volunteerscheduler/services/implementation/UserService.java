package io.github.xucsci260volunteerscheduler.services.interfaces;

import io.github.xucsci260volunteerscheduler.domain.User;
import io.github.xucsci260volunteerscheduler.domain.requests.CreateUserRequest;
import io.github.xucsci260volunteerscheduler.domain.requests.GetUserRequest;
import io.github.xucsci260volunteerscheduler.domain.responses.CreateUserResponse;

import java.util.List;

/**
 * The file UserService.java was created by Grant on 5:06 PM at 4/25/2018
 */

public interface UserService {

    /**
     * call DAO to return all users in database
     * @return list of all users in database
     */
    List<User> getAllUsers();

    /**
     * Create user and pass to DAO for insertion into database
     * @param request CreateUserRequest object
     * @return created user
     */
    CreateUserResponse createUser(CreateUserRequest request);

    /**
     * get user from DAO
     * @param request GetUserRequestObject
     * @return User from DAO
     */
    User getUser(GetUserRequest request);
}
