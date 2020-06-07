package com.example.dependencyinjection.Tests;

import com.example.dependencyinjection.Repositories.SPPUserInformation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SPPUserInformationTests {

    SPPUserInformation sut;

    @Before
    public void beforeEachTestMethod() {
        sut = new SPPUserInformation();
    }

    @After
    public void afterEachTestMethod() {
        sut = null;
    }

    @Test
    public void testGetName_withDefaultInit() {
        //When
        String name = sut.getName();

        //Then
        assertEquals("Mauro", name);
    }

    @Test
    public void testGetAge_withDefaultInit() { //Flaky Test
        //When
        int age = sut.getAge();

        //Then
        assertEquals(29,age);
    }
}
