package com.filipemcoelho.Admin.Employees;

import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public class Staff extends Employee {

    private static ArrayList<Staff> staffs = new ArrayList<>();
    static{
        staffs.ensureCapacity(350);
    }
    private static int idInstances;
    private final int idStaff;

    public Staff(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                 Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                 EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                 Profession profession, Department department) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone,
                personalEmail, otherEmail, homeAddress, profession, department);
        this.idStaff = idInstances + 1;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public static Staff newStaff(FullName fullName, Gender gender, SchoolDate birthDate,
                                 Nationality nationality, Language firstLanguage,
                                 PhoneNumber homePhone, PhoneNumber mobilePhone,
                                 EmailAddress personalEmail, EmailAddress otherEmail,
                                 Address homeAddress, Profession profession, Department department){
        Staff staff = new Staff(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        idInstances++;
        return staff;
    }
}