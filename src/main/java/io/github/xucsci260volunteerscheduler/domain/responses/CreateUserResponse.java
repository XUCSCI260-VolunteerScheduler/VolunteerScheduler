package io.github.xucsci260volunteerscheduler.domain.responses;

import io.github.xucsci260volunteerscheduler.domain.User;

/**
 * The file CreateUserResponse.java was created by Grant on 3:09 PM at 4/3/2018
 */

public class CreateUserResponse {
    private boolean successful;
    private User user;

    public CreateUserResponse(User u, boolean successful) {
        this.user = u;
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public User getUser() {
        return user;
    }
}
