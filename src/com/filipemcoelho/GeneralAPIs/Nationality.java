package com.filipemcoelho.GeneralAPIs;

public class Nationality {

    //TODO: import from txt file list of nationalities

    private String nationality;

    public Nationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String toString() {
        return String.format("%s", nationality);
    }

}
