package com.osipov.spring.mvc;

import lombok.Getter;

@Getter
public enum Departments {
    IT("Information Technology"),
    HR("Human Resources"),
    SALES("Sales");

    private final String description;

    Departments(String description) {
        this.description = description;
    }
}
