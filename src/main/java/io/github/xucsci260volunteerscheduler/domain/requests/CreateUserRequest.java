package io.github.xucsci260volunteerscheduler.domain.requests;

import io.github.xucsci260volunteerscheduler.domain.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.sql.Date;

/**
 * The file CreateUserRequest.java was created by Grant on 1:09 PM at 4/3/2018
 */


public class CreateUserRequest {

    private User user;

    public CreateUserRequest(User u) {
        this.user = u;
    }

    public CreateUserRequest(String dob, String username, String email, String firstName, String lastName, String password){
        user = new User(dob, username, email, firstName, lastName, password);
    }

    public User getUser() {
        return user;
    }
}
