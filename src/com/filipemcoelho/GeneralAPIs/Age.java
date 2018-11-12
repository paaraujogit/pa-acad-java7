package com.filipemcoelho.GeneralAPIs;

import java.time.Duration;
import java.time.Period;

/**
 * class{@code Age} makes some calculations that are basic calculations needed for a school,
 * on the class/teacher side.
 * Since the calculations are all done with no instantiation, the constructor is private to
 * prevent objects being created.
 *
 * @see java.time.Duration
 * @see java.time.Period
 */

public final class Age {

    /**Prevent instantiation for this class */
    private Age(){}

    /**
     * Calculates age from the entered date until today's date.
     * Since Period is a N years, N, months, N days
     * we're just returning N years.
     *
     * @param birthDay Date entered to calculate.
     * @return int value of age
     */
    public static int calculateAge(SchoolDate birthDay){
        SchoolDate today = new SchoolDate();

        Period period = Period.between(birthDay.getDate(), today.getDate());
        return period.getYears();
    }

    /**
     * Does the same as calculateAge method, however, returns a String representation of the {@code Period}
     *
     *
     * @param birthDay Date entered to calculate
     * @return String representation of {@code Period}
     */
    public static String ageToString(SchoolDate birthDay){
        SchoolDate today = new SchoolDate();

        Period period = Period.between(birthDay.getDate(), today.getDate());
        return String.format("%d years, %d months and %d days.", period.getYears(),
                period.getMonths(), period.getDays());
    }

    /**
     * Calculates the {@code Duration} until date entered, since the purpose of the method
     * is to return a daysUntil, all negatives will be return negative (-1) for client to handle
     * the code.
     *
     * Since birthday includes the birth year, we have to create a new date with the day and month
     * of birthday paramenter with "today's" year.
     *
     * @param birthday birth date
     * @return long value of days
     */
    public static long daysUntil(SchoolDate birthday){
        SchoolDate today = new SchoolDate();
        SchoolDate tempDate = new SchoolDate(birthday.getDay(), birthday.getMonth(), today.getYear());
        long days = Duration.between(today.getDate().atStartOfDay(), tempDate.getDate().atStartOfDay()).toDays();
        if(days < 0)
            return -1;

        return days;
    }
}
