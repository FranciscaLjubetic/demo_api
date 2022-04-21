package com.nisum.demo.service;

import com.nisum.demo.model.People;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleRegisterServiceTest {
    @Test
    public void getPeopleTest() {
        People peopleExpectedResult = new People();
        peopleExpectedResult.setName("juan");
        peopleExpectedResult.setLastname("soto");
        peopleExpectedResult.setRut("1365445-9");

        People actualResult = PeopleRegisterService.getPeople();

        assertEquals(peopleExpectedResult, actualResult);
    }
}
