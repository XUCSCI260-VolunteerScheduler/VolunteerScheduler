package io.github.xucsci260volunteerscheduler.domain;

import java.sql.Date;

/**
 * The file User.java was created by Grant on 2:45 PM at 4/2/2018
 */

public class User {
    private String dob;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    public User(String dob, String username, String email, String firstName, String lastName, String password) {
        this.dob = dob;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public User(String dob, String username, String email, String firstName, String lastName, String password, String hash) {
        this.dob = dob;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
