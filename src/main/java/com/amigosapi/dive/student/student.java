package com.amigosapi.dive.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class student {
@Id
     @SequenceGenerator(
             name = "student_sequence",
             sequenceName = "student_sequence",
             allocationSize = 1
     )
     @GeneratedValue(
             strategy = GenerationType.SEQUENCE,
             generator = "deep-dive-spring_sequence"
            )

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
