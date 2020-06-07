package com.example.dependencyinjection.Activities;

import com.example.dependencyinjection.Interfaces.SPPViewModelInterface;
import com.example.dependencyinjection.Models.SPPViewModel;

public class SPPActivity {

    public SPPViewModelInterface model;
    public String titleLabelString = "";

    public SPPActivity(SPPViewModelInterface model) {
        this.model = model;
    }

    public void updateLabel() {
        this.titleLabelString = this.model.getTitle();
    }

}
