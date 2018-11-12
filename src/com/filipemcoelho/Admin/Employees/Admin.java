package com.filipemcoelho.Admin.Employees;

import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public class Admin extends Employee {

    private static ArrayList<Admin> admins = new ArrayList<>();
    static{
        admins.ensureCapacity(20);
    }
    private static int idInstances;
    private final int idAdmin;

    public Admin(FullName fullName, Gender gender, SchoolDate birthDate,
                 Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                 PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail,
                 Address homeAddress, Profession profession, Department department) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone,
                mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        this.idAdmin = idInstances + 1;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public static Admin newAdmin(FullName fullName, Gender gender, SchoolDate birthDate,
                                         Nationality nationality, Language firstLanguage,
                                         PhoneNumber homePhone, PhoneNumber mobilePhone,
                                         EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                         Profession profession, Department department){
        Admin admin = new Admin(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        idInstances++;
        return admin;
    }
}