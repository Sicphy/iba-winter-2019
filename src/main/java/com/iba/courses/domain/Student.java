package com.iba.courses.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    @NotNull
    private String name;

    @Column(name="password")
    @NotNull
    private String password;

    @Column(name="university")
    @NotNull
    private String university;

    @Column(name="login")
    @NotNull
    private String login;

    @Column(name="course")
    @NotNull
    private Integer course;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Student() {

    }

    public Student(@NotNull String name, @NotNull String password, @NotNull String university, @NotNull String login, @NotNull Integer course) {
        this.name = name;
        this.password = password;
        this.university = university;
        this.login = login;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", university='" + university + '\'' +
                ", login='" + login + '\'' +
                ", course=" + course +
                '}';
    }
}
