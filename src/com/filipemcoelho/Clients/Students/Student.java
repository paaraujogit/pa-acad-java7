package com.filipemcoelho.Clients.Students;

import com.filipemcoelho.Admin.Employees.Teacher;
import com.filipemcoelho.Clients.Students.GradingSystem.Grade;
import com.filipemcoelho.Clients.Students.GradingSystem.SubjectGrade;
import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;
import com.filipemcoelho.Timetable.SchoolSubject;
import com.filipemcoelho.Timetable.SchoolYear;
import com.filipemcoelho.Timetable.Term;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student extends Children {

    private static ArrayList<Student> students = new ArrayList<>();

    private static int idInstances;
    private final int idStudent;
    private StudentStatus status;
    private SchoolDateAndTime lastStatus;
    private ArrayList<Grade> grades;

    Student(FullName fullName, Gender gender, SchoolDate birthDate, Nationality nationality,
                    Language firstLanguage, PhoneNumber homePhone, PhoneNumber mobilePhone,
                    EmailAddress personalEmail, EmailAddress otherEmail, Address homeAddress) {
        super(fullName, gender, birthDate, nationality, firstLanguage, homePhone, mobilePhone,
                personalEmail, otherEmail, homeAddress);
        this.status = StudentStatus.ACTIVE;
        this.lastStatus = new SchoolDateAndTime();
        idStudent = idInstances + 1;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public void addNewGrade(SchoolSubject subject, SubjectGrade subjectGrade, SchoolYear schoolYear,
                            Term term, Teacher originalTeacher){
        Grade.newGrade(subject, subjectGrade, schoolYear, term, originalTeacher);
    }

    public static List<Student> searchStudent(Predicate<Student> filter){
        return students.stream().filter(filter).collect(Collectors.toList());
    }

    public static void studentToAlumnum(int idStudent){
        int index = -1;
        for(Student student : students){
            if(student.getIdStudent() == idStudent)
                index = students.indexOf(student);
        }
        students.get(index).status = StudentStatus.INACTIVE;
        students.get(index).lastStatus = new SchoolDateAndTime();
        Alumnum.newAlumnum(students.get(index));
    }

    public static Student newStudent(FullName fullName, Gender gender, SchoolDate birthDate,
                                     Nationality nationality, Language firstLanguage, PhoneNumber homePhone,
                                     PhoneNumber mobilePhone, EmailAddress personalEmail, EmailAddress otherEmail,
                                     Address homeAddress){
        Student student = new Student(fullName, gender, birthDate, nationality, firstLanguage, homePhone,
                mobilePhone, personalEmail, otherEmail, homeAddress);
        students.add(student);
        idInstances++;
        return student;
    }
}