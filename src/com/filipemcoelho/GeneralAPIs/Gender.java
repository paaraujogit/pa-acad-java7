package com.filipemcoelho.GeneralAPIs;

public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    TRANS("Trans");

    String gender;

    //Constructor
    Gender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return String.format("%s", gender);

    }

}
