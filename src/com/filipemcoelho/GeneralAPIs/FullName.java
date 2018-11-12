package com.filipemcoelho.GeneralAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The {@code FullName} class is a class that validates and controls the Name of a person
 * correcting user mistakes.
 *
 * <p>It's accessors and private methods are prepared to accept any type of String validating and correcting it
 * as necessary to formulate what we know as a Name (Personal Name + optional middle names + Family Name).
 * For mononym persons, where only a name is given, the lastName is considered to be empty with ""
 * and name given (main name) will be considered to be the personal one, firstName.</p>
 *
 * It also, overrides some Java API methods, as the Object.toString method.
 *
 * @author Filipe Coelho
 *
 * @see java.lang.Object#toString()
 */

public class FullName {

    /** Contains all names in the correct order: firstName, middleNames, lastName*/
    private ArrayList<String> fullName;
    /** <i>(Not mandatory)</i> Field to describe a person that's not treated by the actual firstName, but from other name*/
    private String knowName;
    /** <i>(Mandatory)</i> field to produce result, First Name*/
    private String firstName;
    /** <i>(Not Mandatory)</i> field to produce result, First Name*/
    private String middleNames;
    /** <i>(Mandatory)</i> field to produce result, Last Name of*/
    private String lastName;

    /**
     * Optional constructor to accommodate mononym persons.
     * As described in the class description, all other names, will be returned as "".
     *
     * @param firstName String First Name
     */
    public FullName(String firstName){
        this(firstName, "", "");
    }

    /**
     * Secondary constructor, where possibly, a Name is created with just the firstName and lastName fields available
     * The constructor calls the main constructor, giving the default "" (empty String argument) as a middleNames
     *
     * @param firstName String First Name
     * @param lastName String Last Name
     */
    public FullName(String firstName, String lastName) {
        this(firstName, "", lastName);
    }

    /**
     * Main constructor where all name fields are filled.
     *
     * @param firstName String First Name
     * @param middleNames String Middle Name(s)
     * @param lastName String Last Name
     */
    public FullName(String firstName, String middleNames, String lastName) {
        this.firstName = firstName;
        this.middleNames = middleNames;
        this.lastName = lastName;
        this.fullName = new ArrayList<>();
        fixName();
    }

    /**
     * Getter / accessor method to collect the knownName field
     *
     * @return a String
     */
    public String getKnowName() {
        return knowName;
    }

    /**
     * Getter / accessor method to collect the firstName field
     *
     * @return a String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter / accessor method to collect the middleNames field
     * Since the Name might be constructed from the secondary constructor, the main gives it a default argument
     * so no need to do a exception or alteration on the getter
     *
     * @return a String
     */
    public String getMiddleNames() {
        return middleNames;
    }

    /**
     * Getter / accessor method to collect the lastName field
     *
     * @return a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter / mutator method to alter the knowName field
     *
     * @param knowName A String stating the knowName
     */
    public void setKnowName(String knowName) {
        this.knowName = knowName;
    }

    /**
     * setter / mutator method to alter the firstName field with a {@code trim()} result of the String argument
     *
     * Calls the {@code countWordValidation} to count the words the parameter has.
     * If parameter has more than one word it will throw an exception and keep just the first word.
     *
     * After validation, calls the {@code fixName} to fix the variables and fill the fullName ArrayList correctly
     *
     * @param firstName A String stating the firstName
     */
    public void setFirstName(String firstName) {
        //TODO: Add exception and allow user to enter String again
        int count = countWordValidation(firstName);
        if(count > 1){
            //Until exception is made, keep just the first word
            String[] words = firstName.split("\\s+");
            this.firstName = words[0];
        } else {
            this.firstName = firstName.trim();
        }
        fixName();
    }

    /**
     * <b>Note:</b> calling the setMiddleNames will substitute all names:
     *      Field middleNames
     *      Any name between the first (index 0) and last name of the array (index length()-1)
     *      calling the {@code fixName()} method
     *
     * @param middleNames String with all middle names
     */
    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames.trim();
        fixName();
    }

    /**
     * setter / mutator method to alter the lastName field with a {@code trim()} result of the String argument
     *
     * Calls the {@code countWordValidation} to count the words the parameter has.
     * If parameter has more than one word it will throw an exception and keep just the first word.
     *
     * After validation, calls the {@code fixName} to fix the variables and fill the fullName ArrayList correctly
     *
     * @param lastName A String stating the lastName
     */
    public void setLastName(String lastName) {
        //TODO: Add exception and allow user to enter String again
        int count = countWordValidation(lastName);
        if(count > 1){
            //Until exception is made, keep just the first word
            String[] words = lastName.split("\\s+");
            this.lastName = words[0];
        } else {
            this.lastName = lastName.trim();
        }
        fixName();
    }

    /**
     * <b>Note:</b> Calling this method, substitutes all fields of the name:
     *      <pre>
     *      firstName; middleNames; lastName;
     *      </pre>
     * And organizes the fullName ArrayList with the {@code fixName} method.
     *
     * @param fullName The full name string
     */
    public void setFullName(String fullName) {
        String[] name = fullName.split("\\s+");

        int wordCount = countWordValidation(fullName);
        if(wordCount == 1){
            this.firstName = name[0];
            this.lastName = "";
        } else {
            this.firstName = name[0];
            this.lastName = name[name.length-1];
        }

        StringBuilder middle = new StringBuilder();
        if(wordCount > 2){
            for(int i = 1; i < name.length-1; i++){
                middle.append(name[i]);
                middle.append(" ");
            }
            this.middleNames = middle.toString();
        } else {
            middleNames = "";
        }

        fixName();
    }

    /**
     * Counts the number of words of a String
     *
     * @param string The String to be validated
     * @return returns an int with the count of the words
     */
    private static int countWordValidation(String string){
        //TODO: Add null exception for String parameter
        String name = string.trim();
        int count = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' ')
                count++;
        }
        return count + 1;
    }

    /**
     * This method enters the name in the correct order into the ArrayList fullName.
     * <pre>
     * First:   Separates middleNames in a {@code List}
     * Second:  Enters the names in the list int the correct order
     * Third:    Arranges the input of the names calling (@code arrangeName) method,
     *          trimming the result to prevent white spaces in the name
     * Forth:   Fixes the Fields
     * </pre>
     *
     */
    private void fixName(){
        List<String> middleNames = new ArrayList<>();
        if(getMiddleNames().length() > 0){
            middleNames = Arrays.asList(getMiddleNames().split("\\s+"));
        }

        this.fullName = new ArrayList<String>();

        this.fullName.add(getFirstName());
        if(getMiddleNames().length() > 0)
            this.fullName.addAll(middleNames);
        this.fullName.add(getLastName());

        for(int i = 0; i < fullName.size(); i++){
            String temp = fullName.get(i).trim();
            fullName.remove(i);
            if(temp.equals(""))
                continue;
            fullName.add(i, arrangeName(temp));
        }

        this.firstName = arrangeName(getFirstName().trim());
        this.middleNames = String.join(" ", middleNames);
        this.lastName = getLastName().equals("") ? "" : arrangeName(getLastName().trim());
    }

    /**
     * Arranges the String in the following way:
     * First capital letter
     * Rest with lowercase letters
     *<blockquote><pre>
     *      "filIpe" returns "Filipe"
     * </pre></blockquote>
     *
     * @param string The String to be fixed
     * @return the fixed string
     */
    private static String arrangeName(String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    /**
     * Overrides the {@code Object} class toString method, giving the result as we want to produce
     * the FullName class
     *
     * @return a String format of the {@code ArrayList fullName}
     * @since 1.8
     */
    @Override
    public String toString(){
        return String.join(" ", fullName);
    }

    /**
     * If necessary, call this method to show the (@code fullName) ArrayList on the console
     *
     */
    public void printName(){
        for(String value : fullName){
            System.out.printf("%s ", value.equals(" ") ? "?" : value);
        }
    }
}
