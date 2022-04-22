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
//    @GetMapping("/")
//    public static People getPeople(){
//        People people = PeopleRegisterService.getPeople();
//        System.out.println(people);
//        return people ;
//    }

    @GetMapping("/test")
    public static PeopleRepository getRepository(){
        PeopleRepository repo = PeopleRepository.getRepository();
        return repo;
    }

}
