package com.example.securityrole;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Uzenet {
    @NotNull
    private long id;
    @NotNull
    @Size(min=2)
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
