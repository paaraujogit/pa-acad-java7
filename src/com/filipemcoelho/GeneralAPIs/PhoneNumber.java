package com.filipemcoelho.GeneralAPIs;

public class PhoneNumber {

    String number;

    //Constructor
    public PhoneNumber(String number) {
        this.number = number;
    }

    //Getter
    public String getNumber() {
        return number;
    }

    //Setter
    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        if (number == null || number.equalsIgnoreCase(""))
            return "NA";
        return String.format("%s", number);
    }
}
