package io.github.xucsci260volunteerscheduler.domain.RequestObjects;

/**
 * The file ChangePasswordRequest.java was created by Chris on 9:57 PM at 3/11/2018
 */

public class ChangePasswordRequest {
    private String oldPassword;
    private String username;
    private String newPassword;

    public ChangePasswordRequest(String username, String oldPassword, String newPassword) {
        this.username = username;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
