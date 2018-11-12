package com.filipemcoelho.GeneralAPIs;

import java.time.LocalDate;


/**
 * Class {@code SchoolDate }is a class that through composition allows it's holders to represent their dates(birthdays,
 * entry dates, holidays, etc.) in a correct way. Since the main base of the {@code date} is Java 1.8
 * new {@link java.time.LocalDate} it allows for a more controllable code.
 * <p>
 * The introduced getters are only to provide a more accessible way to get the information.
 * <p>
 * This class has two constructors, one that get's the system date and one that the client enters his own date.
 *
 * @see java.time.LocalDate
 */
public class SchoolDate {

    /** The only Field on this class {@link LocalDate} {@code date}*/
    private LocalDate date;

    /**
     * Constructor that when class is instantiated from, get's the system date, good for recordEntry dates,
     * system access dates, etc.
     */
    public SchoolDate() {
        date = LocalDate.now();
    }

    /**
     * Constructor than when class is instantiated from, the client enters the required dates that constitute a date,
     * apropriate for birthday, etc.
     *
     * @param day   day of the month
     * @param month month of the year
     * @param year  year
     */
    public SchoolDate(int day, int month, int year) {
        date = LocalDate.of(year, month, day);
    }

    public LocalDate getDate(){
        return this.date;
    }

    /**
     * getter / accessor method that returns the day
     *
     * @return day {@code int}
     */
    public int getDay() {
        return date.getDayOfMonth();
    }

    /**
     * getter / accessor method that returns the month
     *
     * @return month {@code int}
     */
    public int getMonth() {
        return date.getDayOfMonth();
    }

    /**
     * getter / accessor method that returns the year
     *
     * @return year {@code int}
     */
    public int getYear() {
        return date.getYear();
    }

    /**
     * getter / accessor method that returns how many days the date specified year has.
     *
     * @return days in a year {@code int}
     */
    public int getDaysOfYear() {
        return date.getDayOfYear();
    }

    /**
     * Setter / mutator method that completely changes the date
     *
     * @param day   day of the month
     * @param month month of the year
     * @param year  year
     */
    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    /**
     * Setter / mutator method that changes the day
     *
     * @param day day of the month
     */
    public void setDay(int day) {
        date = date.withDayOfMonth(day);
    }

    /**
     * Setter / mutator method that changes the month
     *
     * @param month month of the year
     */
    public void setMonth(int month) {
        date = date.withMonth(month);
    }

    /**
     * Setter / mutator method that changes the year
     *
     * @param year year
     */
    public void setYear(int year) {
        date = date.withYear(year);
    }

    @Override
    public String toString() {
        //TODO: Provide local format to system
        return String.format("%02d/%02d/%04d", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }
}
