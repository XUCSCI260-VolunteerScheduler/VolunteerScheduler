package io.github.xucsci260volunteerscheduler.domain.ResponseObjects;

import io.github.xucsci260volunteerscheduler.domain.Person;

/**
 * The file CreatePersonResponse.java was created by Chris on 9:48 PM at 3/11/2018
 */

public class CreatePersonResponse {
    private boolean created;
    private Person person;

    public CreatePersonResponse(boolean created, Person person) {
        this.created = created;
        this.person = person;
    }

    /**
     * isCreated
     * @return true if person did not already exist
     */
    public boolean isCreated() {
        return created;
    }

    /**
     * person
     * @return person that was created or already exists
     */
    public Person getPerson() {
        return person;
    }
}
