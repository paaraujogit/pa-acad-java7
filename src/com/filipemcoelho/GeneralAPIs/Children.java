package com.filipemcoelho.GeneralAPIs;

import com.filipemcoelho.Clients.Students.Student;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public abstract class Children extends Person {

    private static ArrayList<Children> childrens = new ArrayList<>();
    static{
        childrens.ensureCapacity(1500);
    }
    private static int idInstances;

    private final int idChildren;

    public Children(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                    Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                    EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        this.idChildren = idInstances + 1;
    }

    public static void newChildStudent(FullName fullName, Gender gender, SchoolDate birthDate,
                                        Nationality nationality, Language firstLanguage,
                                        PhoneNumber homePhone, PhoneNumber mobilePhone,
                                        EmailAddress personalEmail, EmailAddress otherEmail,Address homeAddress){
        Children child = Student.newStudent(fullName, gender, birthDate, nationality,
                firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        Children.childrens.add(child);
        idInstances++;
    }
}