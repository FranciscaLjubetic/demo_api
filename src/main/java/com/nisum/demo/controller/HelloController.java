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

//        Persona nieto11 = ;
//        Persona nieto12 =
//
//        Persona nieto21 = ;
//        Persona nieto22 = ;


        ArrayList<Persona> Nietos1 = new ArrayList<>();
        Nietos1.add(new Persona("playboy", "Francisca", "46798-8", null));
        Nietos1.add(new Persona("Karen", "Paola", "46798-8", null));

        ArrayList<Persona> Nietos2 = new ArrayList<>();
        Nietos2.add(new Persona("Javiera", "Morales", "46798-8", null));
        Nietos2.add(new Persona("Lis", "Gabriela", "46798-8", null));


        ArrayList<ArrayList> ArregloNietos = new ArrayList<>();
        ArregloNietos.add(Nietos1);
        ArregloNietos.add(Nietos2);

        listPersonas.add(e);
        listPersonas.add(f);

        Hijos.add(e);
        Hijos.add(f);
        Hijos.add(x);



//        for (int i = 0; i < listPersonas.size(); i++) {
//
//            listPersonas.get(i).setSon(ArregloNietos.get(i));
//        }


        System.out.println(Hijos);
//
        p.setSon(Hijos);
//      listPersonas.add(e, f, );
        System.out.println("esta es una persona " + p);

        return p;
    }
}
