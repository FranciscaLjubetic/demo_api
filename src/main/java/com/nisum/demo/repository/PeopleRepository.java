package com.nisum.demo.repository;

import com.nisum.demo.model.People;

import java.util.ArrayList;

public class PeopleRepository {

    private static ArrayList<People> allPeople = new ArrayList<>();

    public static void setRepository() {

        PeopleRepository repo = new PeopleRepository();

        People Rosa = new People("Rosa", "Martinez", "789652365425-2", 58,null);

        People Gladys = new People("GLadys", "Del Río", "52365425-2", 21,null);

        People Fran = new People("Francisca", "Lju", "565425-2", 76,null);

        People Juana = new People("Juana", "lopez", "165748202-3", 99,null);

        People Fede = new People("Federico", "martinez", "7365425-2", 17,null);

        People Anggelo = new People("Anggelo", "Urso", "27365425-2", 11,null);

        People Alicia = new People("Alicia", "Zamorano", "27378425-2", 15,null);

        allPeople.add(Rosa);
        allPeople.add(Gladys);
        allPeople.add(Fran);
        allPeople.add(Juana);
        allPeople.add(Fede);
        allPeople.add(Anggelo);
        allPeople.add(Alicia);
    }

    public static ArrayList<People> getRepository() {
        return PeopleRepository.allPeople;
    }
}
