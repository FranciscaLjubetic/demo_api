package com.nisum.demo.repository;

import com.nisum.demo.model.People;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.List;

// Crear 1: lista people 2: get people, atributo lista de persona.
// Una llamada a este repositorio para que nos regrese la lista.
// Regresar todas las personas que sean mayores a 18 años.
// Agregar 5 personas.
// Agregar unit Test al return de 18 años

public class PeopleRepository {
    public static People personasTogether() {
        //List<People> allPeople = new ArrayList<>();

        //PeopleRepository persona = new PeopleRepository();

        People persona = new People();
        persona.setName("Juana");
        persona.setLastname("lopez");
        persona.setRut("165748202-3");
        persona.setAge(99);
        persona.setSon(null);

        //People fulano = People.builder().name("juana").lastname("martinez").rut("7896523654252").age(88).Son(null).build();
        //allPeople.add(fulano);
        return persona;
    }
}
