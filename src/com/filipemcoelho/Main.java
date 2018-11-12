package com.filipemcoelho;

import com.filipemcoelho.Clients.Students.Alumnum;
import com.filipemcoelho.Clients.Students.Student;
import com.filipemcoelho.I18N.Localization;

import java.util.ArrayList;

public class Main {

    /**
     * Instance field for {@code SchoolModel}
     *
     * @see SchoolModel
     */
    private static SchoolModel schoolModel;

    /**
     * Instance field for {@code GuiModel}
     *
     * @see GuiModel
     */
    private static GuiModel guiModel;

    /**
     * Instance field for {@code DataBaseModel}
     *
     * @see DataBaseModel
     */
    private static DataBaseModel dataBaseModel;

    /**
     * Main method for SchoolManagerApp, fetches the arguments from Application @{code String[] args} calling the {@code setLocale} method
     * and assigns {@code SchoolModel schoolModel} the instance of the model
     *
     * @param args two arguments are required when calling the application, by this order:
     *            1st - language; 2nd - country
     */
    public static void main(String[] args) {

        setLocale(args);

        //Instantiate the schoolModel model
        schoolModel = SchoolModel.getInstance();
        //Instantiate the guiModel model
        guiModel = GuiModel.getInstance();
        //Instantiate the dataBaseModel model
        dataBaseModel = DataBaseModel.getInstance();

        //Test area
        testArea();
    }

    /**
     * This method reads the arguments from program arguments {@code String[]  args}
     * and set's the {@link Localization} {@code Locale} based on those arguments.
     *
     * If no arguments are given when calling the program, default will be set to
     * language = en (English)
     * Country = US (United States of America)
     *
     * @see java.util.Locale
     *
     * @param args two arguments are required when calling the application, by this order:
     *             1st - language; 2nd - country
     */
    @SuppressWarnings("HardCodedStringLiteral")
    private static void setLocale(String[] args){
        String language;
        String country;
        if (args.length != 2) {
            language = "en";
            country = "US";
        } else {
            language = args[0];
            country = args[1];
        }
        Localization.setLocale(language, country);
    }

    private static void testArea(){
        //Test the localization
        System.out.println(Localization.getString("greetings"));

        //Test student and alumni promotion
        ArrayList<Student> students = Student.getStudents();

        Student.studentToAlumnum(1);

        ArrayList<Alumnum> alumni = Alumnum.getAlumni();

        for(Alumnum alumnum : alumni){
            System.out.println(alumnum);
        }
    }
}