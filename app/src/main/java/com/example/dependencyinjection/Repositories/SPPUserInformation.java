package com.example.dependencyinjection.Repositories;

import com.example.dependencyinjection.Interfaces.SPPUserInformationRepository;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.YEAR;

public class SPPUserInformation implements SPPUserInformationRepository {
    String name;
    Date birthDay;

    public SPPUserInformation() {
        name = "Mauro";
        birthDay = new Date(90,12,10,22,22,22);
    }

    public SPPUserInformation(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public int getAge() {
        Date now = new Date();
        int age = getDiffYears(this.birthDay, now);
        if(age > 0) {
            return age;
        }
        return 0;
    }




    public static int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        return diff;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

}
