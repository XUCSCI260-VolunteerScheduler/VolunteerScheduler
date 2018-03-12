package io.github.xucsci260volunteerscheduler.domain.ResponseObjects;

/**
 * The file ChangePasswordResponse.java was created by Chris on 9:57 PM at 3/11/2018
 */

public class ChangePasswordResponse {
    private boolean successful;
    private String username;
    // create enum of errors in future?
    private String error;

    public ChangePasswordResponse(boolean successful, String username, String error) {
        this.successful = successful;
        this.username = username;
        this.error = error;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getUsername() {
        return username;
    }

    public String getError() {
        return error;
    }
}
