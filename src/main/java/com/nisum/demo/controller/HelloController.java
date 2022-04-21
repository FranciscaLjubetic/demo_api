package com.nisum.demo.controller;

import com.nisum.demo.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/") //punto de entrada, puedes dejarlo vacío o con barra o a veces colocamos api.
//Rest Controller, para que lo tome como un controlador. Hay que injectar la librería Started web.
@RestController
public class HelloController {
    @GetMapping("/")
    public static Persona testMethod(){
        //Padre
        Persona p = new Persona();
        p.setName("juan");
        p.setLastname("soto");
        p.setRut("1365445-9");

        //Hijo
        Persona e = new Persona();
        e.setName("rosa");
        e.setLastname("rojas");
        e.setRut("136456975-9");

        //Hijo
        Persona f = new Persona();
        f.setName("Beatriz");
        f.setLastname("Lopez");
        f.setRut("16456975-9");

        //Hijo
        //Se prueba otra forma de crear un objeto
        Persona x = new Persona("juan", "soto junior", "46798-8", null);

        //Creacion de Lista principal
        List<Persona> listPersonas = new ArrayList<>();

        //Creacion de ArrayList secundario, para incorporarlo en la lista principal.
        ArrayList<Persona> Hijos = new ArrayList<>();

        listPersonas.add(e); //listPersonas = los primeros hijos.
        listPersonas.add(f);

        // hijos del abuelo juan
        Hijos.add(e);
        Hijos.add(f);
        Hijos.add(x);

        p.setSon(Hijos);// a juan abuelo le pusimos hijos

        //Creacion de ArrayList terciario para incorporarlo a la lista secundaria.

        //Hijos para el primer hijo del padre, por eso son nietos.
        ArrayList<Persona> Nietos1 = new ArrayList<>();
        //opcion 1 de agregar a lista.
        Nietos1.add(new Persona("playboy", "Francisca", "46798-8", null));
        Nietos1.add(new Persona("Karen", "Paola", "46798-8", null));

        // opcion 3 de crear un objeto y opcion 2 de agregar a lista.
        // por qué es redundanto instanciarlo?
        Persona j = new Persona();
                j = Persona.builder().name("juana").lastname("martinez").rut("7896523654252").Son(Nietos1).build();

        // opcion 3 de agregar a lista como nietos
        ArrayList<Persona> HijosdeBea = new ArrayList<>();
        HijosdeBea.add(j);
//        Persona xxx = new Persona();
//        xxx.setName("playboy");

        //opcion constructora
        Persona.builder().name("julito").lastname("martinez").rut("7896523654252").build();

        ArrayList<Persona> Nietos2 = new ArrayList<>();
        Nietos2.add(new Persona("Javiera", "Morales", "46798-8", null));
        Nietos2.add(new Persona("Lis", "Gabriela", "46798-8", null));

        e.setSon(Nietos1); // hijos para rosa
        f.setSon(HijosdeBea);
        x.setSon(Nietos2); // hijos para juan soto junior

        System.out.println("esta es una persona " + p);

        return p;
    }
}
