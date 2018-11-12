package com.filipemcoelho.GeneralAPIs.Address;

public class PostalCode {

    private String primary;
    private String secondary;

    //Constructors

    //Main constructor
    public PostalCode(String primary) {
        this.primary = primary;
    }

    public PostalCode(String primary, String secondary) {
        this(primary);
        this.secondary = secondary;
    }

    //Getters
    public String getPrimary() {
        return primary;
    }

    public String getSecondary() {
        return secondary;
    }

    //Setters
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String toString() {
        if (secondary == null)
            return String.format("%s", primary);
        return String.format("%s-%s", primary, secondary);
    }
}
