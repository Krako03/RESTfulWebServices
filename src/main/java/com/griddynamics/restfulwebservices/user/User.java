package com.griddynamics.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class User {
    private Integer id;

    @Size(min = 2, max = 50, message = "Name should have at least 2 characters")
    @JsonProperty("userName")
    private String name;

    @Past(message = "Date should be in the past")
    private LocalDateTime birthday;

    public User(Integer id, String name, LocalDateTime birthday) {
        super();
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
