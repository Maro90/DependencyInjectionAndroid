package com.example.dependencyinjection.Mocks;

import com.example.dependencyinjection.Interfaces.SPPViewModelInterface;

public class SPPViewModelMock implements SPPViewModelInterface {
    public String titleResult = "";

    @Override
    public String getTitle() {
        return titleResult;
    }

}
