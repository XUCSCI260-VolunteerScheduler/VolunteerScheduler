package io.github.xucsci260volunteerscheduler.services.interfaces;

import io.github.xucsci260volunteerscheduler.domain.Person;
import io.github.xucsci260volunteerscheduler.domain.RequestObjects.ChangePasswordRequest;
import io.github.xucsci260volunteerscheduler.domain.ResponseObjects.ChangePasswordResponse;
import io.github.xucsci260volunteerscheduler.domain.ResponseObjects.CreatePersonResponse;

/**
 * The file PersonService.java was created by Chris on 9:41 PM at 3/11/2018
 */

public interface PersonService {

    /**
     * calls DAO to create person in database
     * @param person
     * @return CreatePersonResponse -> bool and person
     */
    CreatePersonResponse createPerson(Person person);

    /**
     * changes user's password
     *
     * call DAO to get hash for username
     * check oldPassword is valid
     * replace old password with new and update hash
     * @param request object containing necessary information
     * @return object containing necessary information
     */
    ChangePasswordResponse changePassword(ChangePasswordRequest request);
}
