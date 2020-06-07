package com.example.dependencyinjection.Mocks;

import com.example.dependencyinjection.Interfaces.SPPUserInformationRepository;

import java.util.Date;

public class SPPUserInformationRepositoryMock implements SPPUserInformationRepository {
    public String nameResult;
    public Date birthDayResult = new Date();
    public Integer ageResult = 0;

    @Override
    public String getName() {
        return nameResult;
    }

    @Override
    public Date getBirthDay() {
        return birthDayResult;
    }

    @Override
    public int getAge() {
        return ageResult;
    }
}
