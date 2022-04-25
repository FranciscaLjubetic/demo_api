package com.nisum.demo.repository;

import com.nisum.demo.model.People;

import java.util.ArrayList;

// Crear 1: lista people 2: get people, atributo lista de persona.
// Una llamada a este repositorio para que nos regrese la lista.
// Regresar todas las personas que sean mayores a 18 años.
// Agregar 5 personas.
// Agregar unit Test al return de 18 años

public class PeopleRepository {
    public static ArrayList<People> personasTogether() {
        ArrayList<People> allPeople = new ArrayList<>();
        //PeopleRepository persona = new PeopleRepository();

        People persona1 = new People();
        persona1.setName("Juana Rosa");
        persona1.setLastname("Rojas");
        persona1.setAge(99);
        persona1.setRut("165748202-3");
        persona1.setSon(null);
        //People fulano = People.builder().name("juana").lastname("martinez").rut("7896523654252").age(88).Son(null).build();
        allPeople.add(persona1);

        People persona2 = new People();
        persona2.setName("Giaconda");
        persona2.setLastname("Giocasta");
        persona2.setAge(15);
        persona2.setRut("165748202-3");
        persona2.setSon(null);
        allPeople.add(persona2);

        People persona3 = new People();
        persona3.setName("Aurelio Primero");
        persona3.setLastname("Aurelis");
        persona3.setAge(25);
        persona3.setRut("148202-3");
        persona3.setSon(null);
        allPeople.add(persona3);

        People persona4 = new People();
        persona4.setName("Aurelio Segundo");
        persona4.setLastname("Aurelis");
        persona4.setAge(15);
        persona4.setRut("148202-3");
        persona4.setSon(null);
        allPeople.add(persona4);

        People persona5 = new People();
        persona5.setName("Aurelio Tercero");
        persona5.setLastname("Aurelis");
        persona5.setAge(18);
        persona5.setRut("148202-3");
        persona5.setSon(null);
        allPeople.add(persona5);

        People persona6 = new People();
        persona6.setName("Aurelio Cuarto");
        persona6.setLastname("Aurelis");
        persona6.setAge(18);
        persona6.setRut("148202-3");
        persona6.setSon(null);
        allPeople.add(persona5);

        return allPeople;
    }
}
