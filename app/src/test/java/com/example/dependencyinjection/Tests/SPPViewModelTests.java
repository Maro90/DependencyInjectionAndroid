package com.example.dependencyinjection.Tests;

import com.example.dependencyinjection.Activities.SPPActivity;
import com.example.dependencyinjection.Mocks.SPPUserInformationRepositoryMock;
import com.example.dependencyinjection.Mocks.SPPViewModelMock;
import com.example.dependencyinjection.Models.SPPViewModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SPPViewModelTests {

    SPPUserInformationRepositoryMock repositoryMock;
    SPPViewModel sut;

    @Before
    public void beforeEachTestMethod() {
        repositoryMock = new SPPUserInformationRepositoryMock();
        sut = new SPPViewModel(repositoryMock);
    }

    @After
    public void afterEachTestMethod() {
        repositoryMock = null;
        sut = null;
    }

    @Test
    public void testGetTitle_whenHaventAName() {
        //When
        String title = sut.getTitle();

        //Then
        assertEquals("Hola Amigo", title);
    }

    @Test
    public void testGetTitle_whenHaveAName() {
        //Given
        repositoryMock.nameResult = "Martin";

        //When
        String title = sut.getTitle();

        //Then
        assertEquals("Hola Martin", title);
    }

}
