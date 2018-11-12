package com.filipemcoelho;

import com.filipemcoelho.Admin.Employees.*;
import com.filipemcoelho.Clients.Parents.Parent;
import com.filipemcoelho.Clients.Students.Student;
import com.filipemcoelho.GeneralAPIs.Gender;
import com.filipemcoelho.GeneralAPIs.Person;
import com.filipemcoelho.I18N.Localization;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class SchoolModel {

    //Constructor
    private SchoolModel(){

        //Calls the method psvm for tests
        psvm();
    }

    private void psvm(){

        loadPersonDummies();

//        searchPerson();

    }

     /**
      * Singleton Instantiation
      *
      * {@code Inner static helper class} to instantiate the only possible
      * instantiation of the {@code SchoolModel} class.
      *
      * Protecting this way, prevents the class being loaded into the memory,
      * and only when someone calls the {@code getInstance} method, the class gets loaded
      * and creates the single class instance. This method is called the
      * "Bill Pugh Singleton Implementation"
      */
    private static class SingletonClass{
        private static final SchoolModel INSTANCE = new SchoolModel();
    }

     /**
      * Singleton Instantiation
      *
      * Calls the inner class {@code SingletonClass}
      *
      * @return the singleton Instance.
      */
    public static SchoolModel getInstance(){
        return SingletonClass.INSTANCE;
    }

     /**
      * TODO: To be deleted
      * TO BE DELETED
      * Method fills the necessary Arrays with "real" random results taken from the {@link RandomInfo} class
      *
      * This method will load newInstance methods from the parent class {@code Person}, getting instances from:
      * <blockquote><pre>
      *       {@code Student}
      *       {@code Teacher}
      *       {@code Admin}
      *       {@code Staff}
      * </pre></blockquote>
      *
      * @see RandomInfo
      */
     @SuppressWarnings("HardCodedStringLiteral")
     private void loadPersonDummies(){
        //Test adding and reading Persons ArrayList<>
        for(int i = 0; i < 1600; i++){
            Person.newPersonChildStudent(RandomInfo.getFullName(), RandomInfo.getGender(), RandomInfo.getBirthdayChild(),
                    RandomInfo.getNationality(), RandomInfo.getLanguage(), RandomInfo.getPhoneNumber(),
                    RandomInfo.getPhoneNumber(), RandomInfo.getEmailAddress(), RandomInfo.getEmailAddress(), RandomInfo.getAddress());
            Person.newPersonParent(RandomInfo.getFullName(), RandomInfo.getGender(), RandomInfo.getBirthdayChild(),
                    RandomInfo.getNationality(), RandomInfo.getLanguage(), RandomInfo.getPhoneNumber(),
                    RandomInfo.getPhoneNumber(), RandomInfo.getEmailAddress(), RandomInfo.getEmailAddress(), RandomInfo.getAddress());

            if(i < 20)
                Person.newPersonTeacher(RandomInfo.getFullName(), RandomInfo.getGender(),
                        RandomInfo.getBirthdayAdult(), RandomInfo.getNationality(),
                        RandomInfo.getLanguage(), RandomInfo.getPhoneNumber(),
                        RandomInfo.getPhoneNumber(), RandomInfo.getEmailAddress(),
                        RandomInfo.getEmailAddress(), RandomInfo.getAddress() ,new Profession(Localization.getString("teacher")),
                        new Department(Localization.getString("teachers")));
            if(i < 5)
                Person.newPersonAdmin(RandomInfo.getFullName(), RandomInfo.getGender(),
                        RandomInfo.getBirthdayAdult(), RandomInfo.getNationality(), RandomInfo.getLanguage(),
                        RandomInfo.getPhoneNumber(), RandomInfo.getPhoneNumber(), RandomInfo.getEmailAddress(),
                        RandomInfo.getEmailAddress(), RandomInfo.getAddress(), RandomInfo.getAdminProfession(),
                        new Department(Localization.getString("teachers")));
            if(i < 100)
                Person.newPersonStaff(RandomInfo.getFullName(), RandomInfo.getGender(),
                        RandomInfo.getBirthdayAdult(), RandomInfo.getNationality(),
                        RandomInfo.getLanguage(), RandomInfo.getPhoneNumber(), RandomInfo.getPhoneNumber(),
                        RandomInfo.getEmailAddress(), RandomInfo.getEmailAddress(), RandomInfo.getAddress(),
                        RandomInfo.getStaffProfession(), RandomInfo.getDepartment());
        }
    }

    @SuppressWarnings("HardCodedStringLiteral")
    public void searchPersons(){
        ArrayList<Person> persons = Person.getPersons();

        for(int i = 0; i < persons.size(); i++){
            System.out.printf("Index:♂ %4d, Class: %-48s SimpleName: %8s, ID: %4d, ", i, persons.get(i).getClass(), persons.get(i).getClass().getSimpleName(),persons.get(i).getIdPerson());
            if(persons.get(i) instanceof Student)
                System.out.printf("ID(subclass): %4d, ", ((Student) persons.get(i)).getIdStudent());
            if(persons.get(i) instanceof Teacher)
                System.out.printf("ID(subclass): %4d, ", ((Teacher) persons.get(i)).getIdTeachers());
            if(persons.get(i) instanceof Admin)
                System.out.printf("ID(subclass): %4d, ", ((Admin) persons.get(i)).getIdAdmin());
            if(persons.get(i) instanceof Parent)
                System.out.printf("ID(subclass): %4d, ", ((Parent) persons.get(i)).getIdParent());
            if(persons.get(i) instanceof Staff)
                System.out.printf("ID(subclass): %4d, ", ((Staff) persons.get(i)).getIdStaff());
            System.out.printf("Birth: %s, Age: %2s;%n", persons.get(i).getBirthDate(), persons.get(i).getAgePerson());
        }
    }

    private void searchPerson(){
        List<Person> persons;
        persons = Person.searchPerson(person -> "Filipe".equals(person.getFullName().getFirstName()) & person.getAgePerson() > 10 & person.getAgePerson() < 20 & person.getGender() == Gender.MALE);

        for(Person person : persons){
            System.out.printf("%s %s %s%n", person.getFullName(), person.getAgePerson(), person.getGender());
        }
    }

}