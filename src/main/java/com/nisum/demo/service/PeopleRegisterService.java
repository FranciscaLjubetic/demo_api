package com.nisum.demo.service;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;

import java.util.ArrayList;


public class PeopleRegisterService{

    public static ArrayList<People> getPeople() {
        PeopleRepository.setRepository();
        PeopleRepository.setFamilyTree();
        return PeopleRepository.getRepository();
    }

    public static ArrayList<People> queryPeopleByAge() {

        ArrayList<People> ageFullFillingPeople = new ArrayList<>();

        for (People guy : PeopleRepository.getRepository()) {
            if ( 18 <= guy.getAge()) {
                ageFullFillingPeople.add(guy);
            }
        }

        return ageFullFillingPeople;
    }

}


