package com.nisum.demo.repository;

import com.nisum.demo.model.People;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Crear 1: lista people 2: get people, atributo lista de persona.
// Una llamada a este repositorio para que nos regrese la lista.
// Regresar todas las personas que sean mayores a 18 años.
// Agregar 5 personas.
// Agregar unit Test al return de 18 años

public class PeopleRepository { // clase repositorio

    static List<People> allPeople = new ArrayList<>();
    //mock de base de datos
    //interfaz entre base de datos inexistente y service
    //service tiene la logica: challenge---> traernos todas las personas mayores de 18.
    // Entonces en el service nosotras no creamos personas, sino que las venimos a buscar al repositorio.


    public static PeopleRepository getRepository() {

        PeopleRepository repo = new PeopleRepository();

        People Rosa = new People("Rosa", "Martinez", "789652365425-2", 58,null);

        People Gladys = new People();
        Gladys = People.builder().name("GLadys").lastname("Del Río").rut("52365425-2").age(21).Son(null).build();
        People Fran = new People();
        Fran = People.builder().name("Francisca").lastname("Lju").rut("12365425-2").age(76).Son(null).build();
        People Juana = new People();
        Juana = People.builder().name("Juana").lastname("lopez").rut("165748202-3").age(99).Son(null).build();
        People Fede = new People();
        Fede = People.builder().name("Federico").lastname("martinez").rut("7365425-2").age(17).Son(null).build();
        People Anggelo = new People();
        Anggelo = People.builder().name("Anggelo").lastname("Urso").rut("27365425-2").age(11).Son(null).build();

        PeopleRepository.allPeople.add(Rosa);
//        this.allPeople.add(Gladys);
//        this.allPeople.add(Fran);
//        this.allPeople.add(Juana);
//        this.allPeople.add(Fede);
//        this.allPeople.add(Anggelo);
        System.out.println(repo);

//        String str = ArrayList.toString(this.allPeople);
        System.out.println(allPeople);
        System.out.println(Rosa);
        return repo;
    }
}
