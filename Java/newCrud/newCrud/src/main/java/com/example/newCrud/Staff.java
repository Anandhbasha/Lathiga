package com.example.newCrud;

import jakarta.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer age;
    private String name;
    private String city;
    private String mobile;
    private Integer salary;
    private String course;

    public Staff() {
    }

    public Staff(String name, Integer age, String city, String mobile, Integer salary, String course) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.mobile = mobile;
        this.salary = salary;
        this.course = course;
    }

    // Getters & setters
    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public Integer getSalary() { return salary; }
    public void setSalary(Integer salary) { this.salary = salary; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
