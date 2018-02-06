package io.github.xucsci260volunteerscheduler.Domain;

import java.io.Serializable;

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
