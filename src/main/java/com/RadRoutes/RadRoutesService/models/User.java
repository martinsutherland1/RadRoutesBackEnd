package com.RadRoutes.RadRoutesService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "sex")
    private String sex;

    @Column(name = "distance_target")
    private double distanceTarget;

    @Column(name = "total_distance")
    private double totalDistance;

    @Column(name = "alias")
    private String alias;


    @JsonIgnoreProperties(value = "user")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "route_id", nullable = false, updatable = false)}
    )
    private List<Route> allRoutes;


    public User(String firstName, String lastName, int age, String email, String sex, double distanceTarget, String alias) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.sex = sex;
        this.distanceTarget = distanceTarget;
        this.alias = alias;
        this.allRoutes = new ArrayList<>();
        this.totalDistance = 0.0;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Route> getAllRoutes() {
        return allRoutes;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance += totalDistance;
    }

    public void setAllRoutes(List<Route> allRoutes) {
        this.allRoutes = allRoutes;
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

    public void addRoute(Route route){
        this.allRoutes.add(route);
        setTotalDistance(route.getDistance());
    }

    public double totalDistance(){
        double total = 0;
        for (int i = 0; i < allRoutes.size(); i++) {
            total += getAllRoutes().get(i).getDistance();


        }
        return total;

    }
}
