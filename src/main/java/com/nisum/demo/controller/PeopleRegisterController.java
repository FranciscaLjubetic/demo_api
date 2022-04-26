package com.nisum.demo.controller;

import com.nisum.demo.model.People;
import com.nisum.demo.service.PeopleRegisterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//@RequestMapping("/")
//Rest Controller
@RestController
public class PeopleRegisterController {

    @GetMapping("/")
    public static ArrayList<People> getPeople(){

        return PeopleRegisterService.getPeople();
    }

    @GetMapping("/query>=18")
    public static ArrayList<People> queryPeopleByAge(){

        return PeopleRegisterService.queryPeopleByAge();
    }
}
