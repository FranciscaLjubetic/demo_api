package com.nisum.demo.service;

import com.nisum.demo.model.People;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleRegisterServiceTest {
    @Test
    public void getPeopleTest() {
        ArrayList<People> peopleExpectedResult = new ArrayList<>();
        /*peopleExpectedResult.get(0);
        /*peopleExpectedResult.setLastname("soto");
        peopleExpectedResult.setRut("1365445-9");*/

        ArrayList<People> actualResult = PeopleRegisterService.getPeople();

        assertEquals(peopleExpectedResult, actualResult);
    }
}
