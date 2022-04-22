package com.nisum.demo.controller;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;
import com.nisum.demo.service.PeopleRegisterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//@RequestMapping("/")
//Rest Controller
@RestController
public class PeopleRegisterController {
    @GetMapping("/")
    public static People getPeople(){

        PeopleRepository.setRepository();

        People people = PeopleRegisterService.getPeople();

        People h1 = PeopleRegisterService.getPeople(1);
        People h2 = PeopleRegisterService.getPeople(2);

        People h1h1 = PeopleRegisterService.getPeople(3);
        People h1h2 = PeopleRegisterService.getPeople(4);

        People h2h1 = PeopleRegisterService.getPeople(5);
        People h2h2 = PeopleRegisterService.getPeople(6);

        PeopleRegisterService.setSons(people, h1, h2);

        PeopleRegisterService.setSons(h1, h1h1, h1h2);

        PeopleRegisterService.setSons(h2, h2h1, h2h2);

        return people ;
    }

    @GetMapping("/query<18")
    public static ArrayList<People> queryPeopleByAge(){

        PeopleRepository.setRepository();

        return PeopleRegisterService.queryPeopleByAge(18, PeopleRepository.getRepository());
    }
}
