package com.nisum.demo.service;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


public class PeopleRegisterService {

    public static People getPeople() {

        ArrayList<People> allPeopleTogether = PeopleRepository.getRepository();

        People p = allPeopleTogether.get(0);

        return p;
    }

    public static People getPeople(int index) {

        ArrayList<People> allPeopleTogether = PeopleRepository.getRepository();

        People p = allPeopleTogether.get(index);

        return p;
    }

    public static ArrayList<People> queryPeopleByAge(int age, ArrayList<People> Persons) {

        ArrayList<People> ageFullFillingPeople = new ArrayList<>();

        for(People guy: Persons){
            int years = guy.getAge();
            if( years <= age) {
                ageFullFillingPeople.add(guy);
            }
        }
        return ageFullFillingPeople;
    }

    public static void setSons(People dad, People son, People son2){

        ArrayList<People> sonsList = new ArrayList<>();

        sonsList.add(son);
        sonsList.add(son2);
        dad.setSon(sonsList);
    }
}
