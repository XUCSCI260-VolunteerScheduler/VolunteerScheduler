package io.github.xucsci260volunteerscheduler.domain;

import java.sql.Date;

/**
 * file Person.java was created by chris on 2/7/18 at 4:14 PM
 * for VolunteerScheduler
 */

public class Person {
    private String firstName, lastName, email, address, city, zip;
    private Date DoB;
    private State state;


    public Person(String first, String last, String email,String address, String city, String zip, Date birthday, String state) {
        State realState = State.valueOf(state);

        setVars(first, last, email, address, city, zip, birthday, realState);
    }

    private void setVars(String first, String last, String email, String address, String city, String zip, Date birthday, State state) {
        firstName = first;
        lastName = last;
        this.email = email;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.DoB = birthday;
        this.state = state;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
