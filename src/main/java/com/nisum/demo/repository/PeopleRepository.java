package com.nisum.demo.repository;

import com.nisum.demo.model.People;

import java.util.ArrayList;

public class PeopleRepository {

    public static ArrayList<People> allPeople = new ArrayList<>();

    public static void setRepository() {

        People Rosa = new People("Rosa", "Martinez", "789652365425-2", 58,null);
        People Gladys = new People("GLadys", "Del Río", "52365425-2", 21,null);
        People Fran = new People("Francisca", "Lju", "565425-2", 76,null);
        People Juana = new People("Juana", "lopez", "165748202-3", 99,null);
        People Fede = new People("Federico", "martinez", "7365425-2", 17,null);
        People Anggelo = new People("Anggelo", "Urso", "27365425-2", 11,null);
        People Alicia = new People("Alicia", "Zamorano", "27378425-2", 15,null);
        People Adalberto = new People( "Adalberto", "Faundez",  "4415498", 105, null);
        People Silvestrito = new People( "Silvestrito", "Faundez",  "294415498", 3, null);

        PeopleRepository.allPeople.add(Rosa);
        PeopleRepository.allPeople.add(Gladys);
        PeopleRepository.allPeople.add(Fran);
        PeopleRepository.allPeople.add(Juana);
        PeopleRepository.allPeople.add(Fede);
        PeopleRepository.allPeople.add(Anggelo);
        PeopleRepository.allPeople.add(Alicia);
        PeopleRepository.allPeople.add(Adalberto);
        PeopleRepository.allPeople.add(Silvestrito);
    }

    public static void setSons(People dad, People son, People son2) {

        ArrayList<People> sonsList = new ArrayList<>();
        sonsList.add(son);
        sonsList.add(son2);
        dad.setSon(sonsList);
    }

    public static void setFamilyTree() {
        People people = PeopleRepository.allPeople.get(0);

        People h1 = PeopleRepository.allPeople.get(1);
        People h2 = PeopleRepository.allPeople.get(2);

        People h1h1 = PeopleRepository.allPeople.get(3);
        People h1h2 = PeopleRepository.allPeople.get(4);

        People h2h1 = PeopleRepository.allPeople.get(5);
        People h2h2 = PeopleRepository.allPeople.get(6);

        setSons(people, h1, h2);
        setSons(h1, h1h1, h1h2);
        setSons(h2, h2h1, h2h2);
    }

    public static ArrayList<People> getRepository() {
        return PeopleRepository.allPeople;
    }
}
