package com.nisum.demo.service;

import com.nisum.demo.model.People;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class PeopleRegisterService {

    public static People getPeople() {

        //Padre
        People p = new People();
        p.setName("juan");
        p.setLastname("soto");
        p.setAge(80);
        p.setRut("1365445-9");

        /*//Hijo, 2 hijos
        People e = new People();
        e.setName("rosa");
        e.setLastname("rojas");
        e.setRut("136456975-9");

        //Hijo
        People f = new People();
        f.setName("Beatriz");
        f.setLastname("Lopez");
        f.setRut("16456975-9");

        //Hijo
        //Se prueba otra forma de crear un objeto
        People x = new People("juan", "soto junior", "46798-8", null);

        //Creacion de Lista principal
        List<People> listPersonas = new ArrayList<>();

        //Creacion de ArrayList secundario, para incorporarlo en la lista principal.
        ArrayList<People> Hijos = new ArrayList<>();

        listPersonas.add(e); //listPersonas = los primeros hijos.
        listPersonas.add(f);

        // hijos del abuelo juan
        Hijos.add(e);
        Hijos.add(f);
        Hijos.add(x);

        p.setSon(Hijos);// a juan abuelo le pusimos hijos

        //Creacion de ArrayList terciario para incorporarlo a la lista secundaria.

        //Hijos para el primer hijo del padre, por eso son nietos.
        ArrayList<People> Nietos1 = new ArrayList<>();
        //opcion 1 de agregar a lista.
        Nietos1.add(new People("playboy", "Francisca", "46798-8", null));
        Nietos1.add(new People("Karen", "Paola", "46798-8", null));

        // opcion 3 de crear un objeto y opcion 2 de agregar a lista.
        // por qué es redundanto instanciarlo?
        People j = new People();
        j = People.builder().name("juana").lastname("martinez").rut("7896523654252").Son(Nietos1).build();

        // opcion 3 de agregar a lista como nietos
        ArrayList<People> HijosdeBea = new ArrayList<>();
        HijosdeBea.add(j);
//        Persona xxx = new Persona();
//        xxx.setName("playboy");

        ArrayList<People> Nietos2 = new ArrayList<>();
        Nietos2.add(new People("Javiera", "Morales", "46798-8", null));
        Nietos2.add(new People("Lis", "Gabriela", "46798-8", null));

        e.setSon(Nietos1); // hijos para rosa
        f.setSon(HijosdeBea);
        x.setSon(Nietos2); // hijos para juan soto junior

        System.out.println("esta es una persona " + p);*/

        return p;
    }
}
