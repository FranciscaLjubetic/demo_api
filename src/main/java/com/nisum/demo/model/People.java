package com.nisum.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class People {

    protected String name;
    protected String lastname;
    protected String rut;
    protected Integer age;
    protected ArrayList<People> Son;

}