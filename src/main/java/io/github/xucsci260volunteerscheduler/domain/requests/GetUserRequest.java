package io.github.xucsci260volunteerscheduler.domain.requests;

import io.github.xucsci260volunteerscheduler.domain.helpers.GetMethodEnum;

/**
 * The file GetUserRequest.java was created by Grant on 1:00 PM at 4/3/2018
 */

public class GetUserRequest {

    private String email;
    private String username;
    private GetMethodEnum method;

    public GetUserRequest(GetMethodEnum method, String email) {
        this.method = method;
        switch (method) {
            case EMAIL:
                this.email = email;
                break;
          /*  case USERNAME:
                this.username = username;
                break;*/
        }
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
