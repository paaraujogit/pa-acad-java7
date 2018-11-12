package com.filipemcoelho.GeneralAPIs;

import com.filipemcoelho.Admin.Employees.*;
import com.filipemcoelho.Clients.Students.Student;
import com.filipemcoelho.GeneralAPIs.Address.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * The abstract (@code Person) is a class that is meant to be extended (@code extends) by any class the represents an
 * object of a real person. e.g. Costumer, Student, Parent, employee, teacher, etc.
 * It's sole purpose as an abstract class is not be instatiated but have as many common fields included that represtn
 * a person, e.g. Name, Address, Mobile phone, email address, etc.
 * It includes all mandatory fields setters and getters to fetch information.
 *
 * It also, overrides some Java API methods, as the Object.toString method.
 *
 * @see java.lang.Object#toString()
 *
 */
public abstract class Person {

    private static ArrayList<Person> persons = new ArrayList<>();
    static{
        persons.ensureCapacity(1500);
    }
    private static int idInstances;

    private FullName fullName; /** This is a mandatory field*/
    private Gender gender; /** This is a mandatory field*/
    private SchoolDate birthDate; /** This is a mandatory field*/
    private Address homeAddress;
    private Nationality nationality;
    private Language firstLanguage;
    private EmailAddress personalEmail;
    private EmailAddress otherEmail;
    private PhoneNumber homePhone;
    private PhoneNumber mobilePhone;
    private SchoolDate recordDate;
    private IdentityDocument identityDocument;

    private int agePerson;
    private final int idPerson;

    private Photo photo;
    private Language secondLanguage;
    private PhoneNumber other;
    private SchoolDate entryDate;
    private SchoolDate lastEdited;

    //Constructors
    public Person(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                  Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                  EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.firstLanguage = firstLanguage;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.personalEmail = personalEmail;
        this.otherEmail = otherEmail;
        this.agePerson = calculateAge(birthDate);
        this.recordDate = new SchoolDate();
        this.homeAddress = homeAddress;
        idPerson = idInstances+1;
    }

    public FullName getFullName() {
        return fullName;
    }

    public SchoolDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(SchoolDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAgePerson() {
        calculateAge(birthDate);
        return agePerson;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Language getFirstLanguage() {
        return firstLanguage;
    }

    public EmailAddress getPersonalEmail() {
        return personalEmail;
    }

    public EmailAddress getOtherEmail() {
        return otherEmail;
    }

    public PhoneNumber getHomePhone() {
        return homePhone;
    }

    public PhoneNumber getMobilePhone() {
        return mobilePhone;
    }

    public SchoolDate getRecordDate() {
        return recordDate;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Language getSecondLanguage() {
        return secondLanguage;
    }

    public PhoneNumber getOther() {
        return other;
    }

    public SchoolDate getEntryDate() {
        return entryDate;
    }

    public SchoolDate getLastEdited() {
        return lastEdited;
    }

    public static ArrayList<Person> getPersons(){
        return persons;
    }

    public void setAgePerson(){
        this.agePerson = calculateAge(birthDate);
    }

    private static int calculateAge(SchoolDate birthday){
        return Age.calculateAge(birthday);
    }

    public int getIdPerson() {
        return idPerson;
    }

    public static List<Person> searchPerson(Predicate<Person> filter){
        return persons.stream().filter(filter).collect(Collectors.toList());
    }

    public static void newPersonChildStudent(FullName fullName, Gender gender, SchoolDate birthDate,
                                             Nationality nationality, Language firstLanguage,
                                             PhoneNumber homePhone, PhoneNumber mobilePhone,
                                             EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress){
        Student student = Student.newStudent(fullName, gender, birthDate, nationality,
                firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        persons.add(student);
        idInstances++;
    }

    public static void newPersonTeacher(FullName fullName, Gender gender, SchoolDate birthDate,
                                        Nationality nationality, Language firstLanguage,
                                        PhoneNumber homePhone, PhoneNumber mobilePhone,
                                        EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                        Profession profession, Department department){
        Adult adult = Adult.newAdultTeacher(fullName, gender, birthDate, nationality,
                firstLanguage, homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        persons.add(adult);
        idInstances++;
    }

    public static void newPersonAdmin(FullName fullName, Gender gender, SchoolDate birthDate,
                                      Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                      PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                      Profession profession, Department department){
        Adult adult = Adult.newAdultAdmin(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress, profession, department);
        persons.add(adult);
        idInstances++;
    }

    public static void newPersonStaff(FullName fullName, Gender gender, SchoolDate birthDate,
                                      Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                      PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress,
                                      Profession profession, Department department){
        Adult adult = Staff.newAdultStaff(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress,profession, department);
        persons.add(adult);
        idInstances++;
    }

    public static void newPersonParent(FullName fullName, Gender gender, SchoolDate birthDate,
                                      Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                      PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress){
        Adult adult = Adult.newAdultParent(fullName, gender, birthDate, nationality, firstLanguage,
                homePhone, mobilePhone, personalEmail, otherEmail, homeAddress);
        persons.add(adult);
        idInstances++;
    }
}
