package com.nisum.demo.service;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


public class PeopleRegisterService {

    public static People getPeople() {
        PeopleRepository repo = new PeopleRepository();

//        //Padre
        People p = new People();
//        p.setName("juan");
//        p.setLastname("soto");
//        p.setAge(80);
//        p.setRut("1365445-9");


        System.out.println("Hola");
        return p;
    }

    public void setSons(People dad, People son){
        ArrayList<People> sonsList = new ArrayList<>();
        sonsList.add(son);
        dad.setSon(sonsList);
    }
}
