package com.filipemcoelho.Admin.Employees;

import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public abstract class Employee extends Adult {

    private final int idEmployee;
    private Profession profession;
    private Department department;

    private static ArrayList<Employee> employees = new ArrayList<>();
    static{
        employees.ensureCapacity(550);
    }

    private static int idInstances;

    public Employee(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                    Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                    EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                    Profession profession, Department department) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        this.profession = profession;
        this.department = department;
        idEmployee = idInstances + 1;
    }

    public static Teacher newEmployeeTeacher(FullName fullName, Gender gender, SchoolDate birthDate,
                                             Nationality nationality, Language firstLanguage,
                                             PhoneNumber homePhone, PhoneNumber mobilePhone,
                                             EmailAddress personalEmail, EmailAddress otherEmail,
                                             Address homeAddress, Profession profession, Department department){
        Teacher teacher = Teacher.newTeacher(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        employees.add(teacher);
        idInstances++;
        return teacher;
    }

    public static Admin newEmployeeAdmin(FullName fullName, Gender gender, SchoolDate birthDate,
                                             Nationality nationality, Language firstLanguage,
                                             PhoneNumber homePhone, PhoneNumber mobilePhone,
                                             EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                             Profession profession, Department department){
        Admin admin = Admin.newAdmin(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        employees.add(admin);
        idInstances++;
        return admin;
    }

    public static Staff newEmployeeStaff(FullName fullName, Gender gender, SchoolDate birthDate,
                                         Nationality nationality, Language firstLanguage,
                                         PhoneNumber homePhone, PhoneNumber mobilePhone,
                                         EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                         Profession profession, Department department){
        Staff staff = Staff.newStaff(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        employees.add(staff);
        idInstances++;
        return staff;
    }
}
