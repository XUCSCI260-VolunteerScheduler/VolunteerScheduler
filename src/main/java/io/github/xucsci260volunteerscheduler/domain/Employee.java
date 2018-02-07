package io.github.xucsci260volunteerscheduler.domain;

import java.sql.Date;

/**
 * file Employee.java was created by chris on 2/7/18 at 4:14 PM
 * for VolunteerScheduler
 */

public class Employee extends Person {

    private String position;
    private Organization organization;

    public Employee(String first, String last, String email, String address, String city, String zip, Date birthday, String state, String position, int orgID) {
        super(first, last, email, address, city, zip, birthday, state);

        this.position = position;
        this.organization = findOrganizationByID(orgID);
    }

    private Organization findOrganizationByID(int id) {
        // TODO service?

        return new Organization(
                1,
                "temp",
                "temp",
                "temp",
                "temp",
                "temp",
                "OH",
                this);
    }
}
