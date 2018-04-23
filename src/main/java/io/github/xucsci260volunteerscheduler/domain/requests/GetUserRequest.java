package io.github.xucsci260volunteerscheduler.domain.requests;

import io.github.xucsci260volunteerscheduler.domain.helpers.GetMethodEnum;

/**
 * The file GetUserRequest.java was created by Grant on 1:00 PM at 4/3/2018
 */

public class GetUserRequest {

    private int ID;
    private String email;
    private String username;
    private GetMethodEnum method;

    public GetUserRequest(GetMethodEnum method, int ID, String email, String username) {
        this.method = method;
        switch (method) {
            case EMAIL:
                this.email = email;
                break;
            case ID:
                this.ID = ID;
                break;
            case USERNAME:
                this.username = username;
                break;
        }
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public GetMethodEnum getMethod() {
        return method;
    }
}
