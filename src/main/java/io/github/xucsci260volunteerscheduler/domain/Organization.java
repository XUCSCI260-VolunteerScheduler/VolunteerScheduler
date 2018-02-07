package io.github.xucsci260volunteerscheduler.domain;

/**
 * file Organization.java was created by chris on 2/7/18 at 4:14 PM
 * for VolunteerScheduler
 */

public class Organization {
    private int id;
    private String name, description, address, city, zip;
    private State state;
    private Employee chair;

    public Organization(int id, String name, String desc, String address, String city, String zip, String state, Employee employee) {
        this.id = id;
        this.name = name;
        this.description = desc;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = State.valueOf(state);
        this.chair = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Employee getChair() {
        return chair;
    }

    public void setChair(Employee chair) {
        this.chair = chair;
    }
}
