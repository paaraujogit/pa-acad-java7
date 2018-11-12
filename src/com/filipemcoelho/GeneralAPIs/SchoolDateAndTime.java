package com.filipemcoelho.GeneralAPIs;


/**
 * Class SchoolDateAndTime combines class {@link SchoolDate} and {@link SchoolTime} if client needs
 * to get a date plus time field.
 *
 * @see SchoolDate
 * @see SchoolTime
 *
 */

public class SchoolDateAndTime {

    /** {@link SchoolDate} {@code date} variable */
    private SchoolDate date;
    /** {@link SchoolTime} {@code time} variable */
    private SchoolTime time;

    /**
     * Constructor that when class is instantiated from, get's the system date and time.
     */
    public SchoolDateAndTime() {
        this.date = new SchoolDate();
        this.time = new SchoolTime();
    }

    /**
     * Constructor than when class is instantiated from, the client enters the required parameters
     * that constitute a date and time (seconds not included, which will be set to default 0.
     *
     * @param day   day of the month
      * @param month month of the year
     * @param year  year
     * @param hour   hour
     * @param minute minute
     */
    public SchoolDateAndTime(int day, int month, int year, int hour, int minute) {
        this(day, month, year, hour, minute, 0);
    }

    /**
     * Constructor than when class is instantiated from, the client enters the required parameters
     * that constitute a date and time
     *
     * @param day   day of the month
     * @param month month of the year
     * @param year  year
     * @param hour   hour
     * @param minute minute
     * @param seconds seconds
     */
    public SchoolDateAndTime(int day, int month, int year, int hour, int minute, int seconds) {
        this.date = new SchoolDate(day, month, year);
        this.time = new SchoolTime(hour, minute, seconds);
    }

    /**
     * getter / accessor method that returns the day
     *
     * @return day {@code int}
     */
    public int getDay() {
        return date.getDay();
    }

    /**
     * getter / accessor method that returns the month
     *
     * @return month {@code int}
     */
    public int getMonth() {
        return date.getMonth();
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
        return date.getDaysOfYear();
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
        date.setDay(day);
    }

    /**
     * Setter / mutator method that changes the month
     *
     * @param month month of the year
     */
    public void setMonth(int month) {
        date.setMonth(month);
    }

    /**
     * Setter / mutator method that changes the year
     *
     * @param year year
     */
    public void setYear(int year) {
        date.setYear(year);
    }

    /**
     * getter / accessor method that returns the hour
     *
     * @return hour {@code int}
     */
    public int getHour() {
        return time.getHour();
    }

    /**
     * getter / accessor method that returns the minutes
     *
     * @return minutes {@code int}
     */
    public int getMinutes() {
        return time.getMinutes();
    }

    /**
     * getter / accessor method that returns the seconds
     *
     * @return seconds {@code int}
     */
    public int getSeconds() {
        return time.getSeconds();
    }

    /**
     * Setter / mutator method that completely changes the time, since no parameter is set for seconds, seconds
     * will be reset to 0.
     *
     * @param hour    hour
     * @param minutes minutes
     */
    public void setTime(int hour, int minutes) {
        setTime(hour, minutes, 0);
    }

    /**
     * Setter / mutator method that completely changes the time
     *
     * @param hour    hour
     * @param minutes minutes
     * @param seconds seconds
     */
    public void setTime(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    /**
     * Setter / mutator method that changes the hour
     *
     * @param hour hour
     */
    public void setHour(int hour) {
        time.setHour(hour);
    }

    /**
     * Setter / mutator method that changes the minutes
     *
     * @param minutes minutes
     */
    public void setMinutes(int minutes) {
        time.setMinutes(minutes);
    }

    /**
     * Setter / mutator method that changes the seconds
     *
     * @param seconds hour
     */
    public void setSeconds(int seconds) {
        time.setSeconds(seconds);
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d - %02d:%02d:%02d", date.getDay(), date.getMonth(), date.getYear(),time.getHour(), time.getMinutes(), time.getSeconds());
    }
}
