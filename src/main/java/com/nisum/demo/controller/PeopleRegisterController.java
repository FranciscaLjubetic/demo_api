package com.nisum.demo.controller;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;
import com.nisum.demo.service.PeopleRegisterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/") //punto de entrada, puedes dejarlo vacío o con barra o a veces colocamos api.
//Rest Controller, para que lo tome como un controlador. Hay que inyectar la librería Started web.
@RestController
public class PeopleRegisterController {
    @GetMapping("/")
    //probar usando una sola, en fila 27 voy directo al repositorio, en la 28 voy al service y el service va al repositorio
    public static ArrayList<People> getPeople(){
        return PeopleRepository.personasTogether();
        //return PeopleRegisterService.getPeople();
    }

    @GetMapping("/query>18")
    public static ArrayList<People> upEighteenAge() {
        return PeopleRegisterService.upEighteenAge(18, PeopleRepository.personasTogether());
    }
}
