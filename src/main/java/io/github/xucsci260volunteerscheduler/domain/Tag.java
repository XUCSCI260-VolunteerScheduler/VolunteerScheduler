package io.github.xucsci260volunteerscheduler.domain;

import java.io.Serializable;

/**
 * file Tag.java was created by chris on 2/7/18 at 4:14 PM
 * for VolunteerScheduler
 */

public class Tag implements Serializable {
    private String text;

    public Tag() {}

    public Tag(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
