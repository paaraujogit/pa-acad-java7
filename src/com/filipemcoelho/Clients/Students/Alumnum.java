package com.filipemcoelho.Clients.Students;

import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;

public final class Alumnum extends Student {

    private static ArrayList<Alumnum> alumni = new ArrayList<>();

    private static int idInstances;
    private final int idAlumnum;
    private StudentStatus alumnumStatus;
    private SchoolDateAndTime lastStatusChangeAlumnum;

    private Alumnum(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                    Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                    EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone,
                personalEmail, otherEmail, homeAddress);
        idAlumnum = idInstances + 1;
        this.alumnumStatus = StudentStatus.ACTIVE;
        this.lastStatusChangeAlumnum = new SchoolDateAndTime();
    }

    public int getIdAlumnum() {
        return idAlumnum;
    }

    public static ArrayList<Alumnum> getAlumni() {
        return alumni;
    }

    public static void alumnumToStudent(int idAlumnum){
        int index = -1;
        for(Alumnum alumnum : alumni){
            if(alumnum.getIdAlumnum() == idAlumnum)
                index = alumni.indexOf(alumnum);
        }
        //TODO: make the method
    }

    public static void newAlumnum(Student student){
        int index = -1;
        for(Alumnum alumnum : alumni){
            if(alumnum.getIdStudent() == student.getIdStudent())
                index = alumni.indexOf(alumnum);
        }
        if(index >= 0){
            alumni.get(index).alumnumStatus = StudentStatus.ACTIVE;
            alumni.get(index).lastStatusChangeAlumnum = new SchoolDateAndTime();
        } else {
            Alumnum alumnum = ((Alumnum) student);
            alumni.add(alumnum);
            idInstances++;
        }
    }
}