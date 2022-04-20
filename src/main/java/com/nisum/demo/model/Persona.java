package com.nisum.demo.model;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.WebDataBinder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private String name;
    private String lastname;
    private String rut;
    private ArrayList<Persona> Son;

}