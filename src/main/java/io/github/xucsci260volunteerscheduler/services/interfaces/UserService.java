package io.github.VolunteerScheduler.services.interfaces;

import io.github.VolunteerScheduler.domain.objects.User;
import io.github.VolunteerScheduler.domain.requests.CreateUserRequest;
import io.github.VolunteerScheduler.domain.requests.GetUserRequest;
import io.github.VolunteerScheduler.domain.responses.CreateUserResponse;

import java.util.List;

/**
 * The file UserService.java was created by Grant on 4:06 PM at 4/3/2018
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
