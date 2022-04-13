package com.amigosapi.dive.student;

import java.time.LocalDate;

public class student {

    private long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;

    public student() {
    }

    public student(long id,
                   String name,
                   String email,
                   Integer age,
                   LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public student(String name,
                   String email,
                   Integer age,
                   LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }
}
