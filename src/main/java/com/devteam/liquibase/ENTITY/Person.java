package com.devteam.liquibase.ENTITY;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "height")
    private String height;

    @Column
    private String address;

    @Column(name = "level")
    private String level;

    @Column(name = "school")
    private String school;

    public Person() {
    }

    public Person(String name, String description) {
        this.name = name;
        this.school = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return school;
    }

    public void setDescription(String description) {
        this.school = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
