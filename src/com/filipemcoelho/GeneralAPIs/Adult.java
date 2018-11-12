package com.filipemcoelho.GeneralAPIs;

import com.filipemcoelho.Admin.Employees.*;
import com.filipemcoelho.Clients.Parents.Parent;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public class Adult extends Person {

    private static ArrayList<Adult> adults = new ArrayList<>();
    static{
        adults.ensureCapacity(1500);
    }
    private static int idInstances;

    private final int idAdult;

    public Adult(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                    Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                    EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        this.idAdult = idInstances + 1;
    }

    public static Adult newAdultTeacher(FullName fullName, Gender gender, SchoolDate birthDate,
                                        Nationality nationality, Language firstLanguage,
                                        PhoneNumber homePhone, PhoneNumber mobilePhone,
                                        EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                        Profession profession, Department department){
        Adult adult = Employee.newEmployeeTeacher(fullName, gender, birthDate, nationality,
                firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        adults.add(adult);
        idInstances++;
        return adult;
    }

    public static Adult newAdultAdmin(FullName fullName, Gender gender, SchoolDate birthDate,
                                      Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                      PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                      Profession profession, Department department){
        Adult adult = Employee.newEmployeeAdmin(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        adults.add(adult);
        idInstances++;
        return adult;
    }

    public static Adult newAdultStaff(FullName fullName, Gender gender, SchoolDate birthDate,
                                      Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                      PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                      Profession profession, Department department){
        Adult adult = Staff.newEmployeeStaff(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        adults.add(adult);
        idInstances++;
        return adult;
    }

    public static Adult newAdultParent(FullName fullName, Gender gender, SchoolDate birthDate,
                                       Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                       PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress){
        Adult adult = Parent.newParent(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        adults.add(adult);
        idInstances++;
        return adult;
    }

}