package com.example.dependencyinjection.Tests;

import com.example.dependencyinjection.Activities.SPPActivity;
import com.example.dependencyinjection.Mocks.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SPPActivityTests {

    SPPViewModelMock viewModelMock = new SPPViewModelMock();
    SPPActivity sut;

    @Before
    public void beforeEachTestMethod() {
        viewModelMock = new SPPViewModelMock();
        sut = new SPPActivity(viewModelMock);
    }

    @After
    public void afterEachTestMethod() {
        viewModelMock = null;
        sut = null;
    }

    @Test
    public void testUpdateLabel_getTitleFromModel() {
        //Given
        viewModelMock.titleResult = "Este titulo es una prueba";

        //When
        sut.updateLabel();

        //Then
        assertEquals("Este titulo es una prueba", sut.titleLabelString);
    }
}
