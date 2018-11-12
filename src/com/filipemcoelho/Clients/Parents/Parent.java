package com.filipemcoelho.Clients.Parents;

import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public class Parent extends Adult {

    private static ArrayList<Parent> parents = new ArrayList<>();
    static{
        parents.ensureCapacity(200);
    }

    private static int idInstances;
    private final int idParent;

    public Parent(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality, Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        this.idParent = idInstances + 1 ;
    }

    public int getIdParent() {
        return idParent;
    }

    public static Parent newParent(FullName fullName, Gender gender, SchoolDate birthDate,
                                   Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                   PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress){
        Parent parent = new Parent(fullName, gender, birthDate, nationality, firstLanguage, homePhone,
                mobilePhone, personalEmail, otherEmail, homeAddress);
        parents.add(parent);
        idInstances++;
        return parent;
    }

}
