package com.filipemcoelho.Admin.Employees;


import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public class Teacher extends Employee {

    private static ArrayList<Teacher> teachers = new ArrayList<>();
    static{
        teachers.ensureCapacity(200);
    }

    private static int idInstances;
    private final int idTeachers;

    public Teacher(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality, Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress, Profession profession, Department department) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        this.idTeachers = idInstances+1;
    }

    public int getIdTeachers() {
        return idTeachers;
    }

    public static Teacher newTeacher(FullName fullName, Gender gender, SchoolDate birthDate,
                                     Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                     PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                     Profession profession, Department department){
        Teacher teacher = new Teacher(fullName, gender, birthDate, nationality, firstLanguage, homePhone,
                mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        teachers.add(teacher);
        idInstances++;
        return teacher;
    }
}
