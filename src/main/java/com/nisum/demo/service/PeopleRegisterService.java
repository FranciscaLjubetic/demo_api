package com.nisum.demo.service;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;

import java.util.ArrayList;


public class PeopleRegisterService {

    public static People getPeople() {

        ArrayList<People> allPeopleTogether = PeopleRepository.getRepository();

        return allPeopleTogether.get(0);
    }

    public static People getPeople(int index) {

        ArrayList<People> allPeopleTogether = PeopleRepository.getRepository();

        return allPeopleTogether.get(index);

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

    public static void setFamilyTree() {
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
    }
}
