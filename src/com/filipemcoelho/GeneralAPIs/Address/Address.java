package com.filipemcoelho.GeneralAPIs.Address;

public class Address {

    //TODO: Look at address Properly.

    //Primitive type
    private String street;
    private String houseNumber;
    private String floor;
    private int constructorUsed = 1;

    //Reference type
    private PostalCode postalCode;  //Has a... composition
    private City city;
    private Country country;

    //Constructors
    //Main constructor
    public Address(PostalCode postalCode, City city, Country country) {
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public Address(String street, String houseNumber, String floor, PostalCode postalCode, City city, Country country) {
        this(postalCode, city, country);
        this.street = street;
        this.houseNumber = houseNumber;
        this.floor = floor;
        //Just to control the toString
        this.constructorUsed = 2;
    }

    public void setPostalCode(String primary, String secondary) {
        this.postalCode = new PostalCode(primary, secondary);
    }

    //Getters
    private String getStreet() {
        return street;
    }

    private String getHouseNumber() {
        return houseNumber;
    }

    private String getFloor() {
        return floor;
    }

    private String getPostalCode() {
        return postalCode.toString();
    }

    private String getCity() {
        return city.getCity();
    }

    private String getCountry() {
        return country.getCountry();
    }

    //Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setCity(String city) {
        this.city = City.newCity(city);
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setPrimaryPostaCode(String primary){
        this.postalCode.setPrimary(primary);
    }

    public void setSecondaryPostalCode(String secondary){
        this.postalCode.setSecondary(secondary);
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(City city) {
        this.city = city;
    }

    //Methods
    public String toString() {
        if (this.constructorUsed == 2)
            return String.format("%n%s, %s%n%s%n", getPostalCode(),
                    getCity(), getCountry());
        return String.format("%s, %s, %s%n%s, %s%n%s", getStreet(),
                getHouseNumber(), getFloor(), getPostalCode(),
                getCity(), getCountry());
    }
}
