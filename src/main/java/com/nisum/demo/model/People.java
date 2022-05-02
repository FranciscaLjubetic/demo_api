package com.nisum.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class People {

    @Id
    private int idPeople;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "lastName", length = 50)
    private String lastName;

    @Column(name = "rut", length = 50)
    private String rut;

    @Column(name = "age")
    private Integer age;
    //private ArrayList<People> Son;

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getrut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}