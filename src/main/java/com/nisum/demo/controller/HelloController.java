package com.nisum.demo.controller;

import com.nisum.demo.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//@RequestMapping("/") //punto de entrada
@RestController
public class HelloController {
    @GetMapping("/")
    public static Persona testMethod(){

        Persona p = new Persona();
        p.setName("juan");
        p.setLastname("soto");
        p.setRut("1365445-9");

        Persona e = new Persona();
        e.setName("rosa");
        e.setLastname("rojas");
        e.setRut("136456975-9");

        Persona f = new Persona();
        f.setName("Beatriz");
        f.setLastname("Lopez");
        f.setRut("16456975-9");

        Persona x = new Persona("juan", "soto junior", "46798-8", null);


        List<Persona> listPersonas = new ArrayList<>();

        ArrayList<Persona> Hijos = new ArrayList<>();



        ArrayList<Persona> Nietos1 = new ArrayList<>();
        Nietos1.add(new Persona("playboy", "Francisca", "46798-8", null));
        Nietos1.add(new Persona("Karen", "Paola", "46798-8", null));

        Persona j = new Persona();
                j = Persona.builder().name("juana").lastname("martinez").rut("7896523654252").Son(Nietos1).build();

        ArrayList<Persona> HijosdeBea = new ArrayList<>();
        HijosdeBea.add(j);


        Persona.builder().name("julito").lastname("martinez").rut("7896523654252").build();

        ArrayList<Persona> Nietos2 = new ArrayList<>();
        Nietos2.add(new Persona("Javiera", "Morales", "46798-8", null));
        Nietos2.add(new Persona("Lis", "Gabriela", "46798-8", null));

        listPersonas.add(e); //listPersonas = los primeros hijos.
        listPersonas.add(f);

        // hijos del abuelo juan
        Hijos.add(e);
        Hijos.add(f);
        Hijos.add(x);


        p.setSon(Hijos);// a juan abuelo le pusimos hijos
        e.setSon(Nietos1); // hijos para rosa hija de juan
        f.setSon(HijosdeBea);
        x.setSon(Nietos2); // hijos para juan soto junior

        System.out.println("esta es una persona " + p);

        return p;
    }
}
