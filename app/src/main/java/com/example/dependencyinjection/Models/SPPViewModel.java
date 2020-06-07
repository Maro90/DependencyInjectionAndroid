package com.example.dependencyinjection.Models;

import com.example.dependencyinjection.Interfaces.SPPUserInformationRepository;
import com.example.dependencyinjection.Interfaces.SPPViewModelInterface;

public class SPPViewModel implements SPPViewModelInterface {
    SPPUserInformationRepository repository;

    public SPPViewModel(SPPUserInformationRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getTitle() {
        String name = this.repository.getName();
        if (name == null) {
            return "Hola Amigo";
        }
        return "Hola "+name;
    }
}
