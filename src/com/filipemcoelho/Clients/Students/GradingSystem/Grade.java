package com.filipemcoelho.Clients.Students.GradingSystem;

import com.filipemcoelho.Admin.Employees.Teacher;
import com.filipemcoelho.GeneralAPIs.SchoolDate;
import com.filipemcoelho.Timetable.SchoolSubject;
import com.filipemcoelho.Timetable.SchoolYear;
import com.filipemcoelho.Timetable.Term;

public class Grade {

    private SchoolSubject subject;
    private SubjectGrade subjectGrade;
    private SchoolYear schoolYear;
    private Term term; //Term based on school year
    private Teacher originalTeacher; //Teacher who gave the grade
    private SchoolDate dateAdded;
    private SchoolDate dateEdited;
    private Teacher editedTeacher;
    private String remarks; //Optional

    private Grade(SchoolSubject subject, SubjectGrade subjectGrade, SchoolYear schoolYear,
                  Term term, Teacher originalTeacher) {
        this.subject = subject;
        this.subjectGrade = subjectGrade;
        this.schoolYear = schoolYear;
        this.term = term;
        this.originalTeacher = originalTeacher;
        this.dateAdded = new SchoolDate();
    }

    public void setSubjectGrade(SubjectGrade grade, Teacher editedTeacher){
        this.subjectGrade = grade;
        this.editedTeacher = editedTeacher;
        this.dateEdited = new SchoolDate();
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public SchoolSubject getSubject() {
        return subject;
    }

    public SubjectGrade getSubjectGrade() {
        return subjectGrade;
    }

    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public Term getTerm() {
        return term;
    }

    public Teacher getOriginalTeacher() {
        return originalTeacher;
    }

    public Teacher getEditedTeacher() {
        return editedTeacher;
    }

    public String getRemarks() {
        return remarks;
    }

    public static Grade newGrade(SchoolSubject subject, SubjectGrade subjectGrade, SchoolYear schoolYear,
                          Term term, Teacher originalTeacher) {
        return new Grade(subject, subjectGrade, schoolYear, term, originalTeacher);
    }

    @Override
    public String toString(){
        return String.format("Year: %s - Term: %s%nSchool Subject: %s - School Teacher: %s%n %s%n",
                getSchoolYear(), getTerm(), getSubject(), getOriginalTeacher(),
                getRemarks() == null ? getRemarks() : "");
    }
}
