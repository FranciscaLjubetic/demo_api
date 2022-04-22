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

    private String name;
    private String lastname;
    private String rut;
    private Integer age;
    private ArrayList<People> Son;

}