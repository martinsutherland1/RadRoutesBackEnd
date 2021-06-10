package com.RadRoutes.RadRoutesService.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private String firstName;
    private String lastName;
    private String email;
    private String sex;
    private int age;
    private double distanceTarget;
    private String alias;


    private List<Route> allRoutes;


    public User(String firstName, String lastName, String email, String sex, int age, double distanceTarget, String alias) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
        this.age = age;
        this.distanceTarget = distanceTarget;
        this.alias = alias;

        this.allRoutes = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDistanceTarget() {
        return distanceTarget;
    }

    public void setDistanceTarget(double distanceTarget) {
        this.distanceTarget = distanceTarget;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
