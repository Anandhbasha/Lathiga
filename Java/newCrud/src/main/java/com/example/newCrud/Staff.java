package com.example.newCrud;

import jakarta.persistence.*;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private  Integer age;
    private String name;

    public Staff(String name,int age){
        this.name= name;
        this.age= age;
    }
//    getter&&Setter

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
