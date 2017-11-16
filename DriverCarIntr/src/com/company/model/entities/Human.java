package com.company.model.entities;

import com.company.model.HumanBuilder;

import java.time.LocalDate;

/**
 * Created by Администратор on 25.01.2016.
 */
public class Human implements HumanDriver, HumanDriverLicence {
    private String name;
    private LocalDate birthDate;
    public enum Gender { MALE , FEMALE };
    private Gender gender;
    public enum BloodGroup {FIRST , SECOND, THIRD , FOURTH};
    private BloodGroup bloodGroup;

    public static HumanBuilder getBuilder() {
        return new HumanBuilder();
    }

    public Human() {
    }

    public Human(String name, LocalDate birthDate, Gender gender, BloodGroup bloodGroup) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public LocalDate birthday() {
        return birthDate;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                '}';
    }
}
