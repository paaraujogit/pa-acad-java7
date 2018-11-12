package com.filipemcoelho.GeneralAPIs;

import java.time.LocalTime;

/**
 * Class {@code SchoolTime }is a class that through composition allows it's holders to represent any time
 * in a correct way. Since the main base of the {@code time} field is Java 1.8 new {@link java.time.LocalTime}
 * it allows for a more controllable code.
 * <p>
 * The introduced getters are only to provide a more accessible way to get the information.
 * <p>
 * This class has three constructors, one that get's the system time, and two that the client enters his own time
 * <pre>
 *     Date = hour, minutes and default 00 seconds
 *     Date = hour, minutes, seconds (entered by client)
 * </pre>
 *
 * @see java.time.LocalTime
 */

public class SchoolTime {

    /**
     * The only Field on this class a {@link LocalTime} {@code time}
     */
    private LocalTime time;

    /**
     * Constructor that when class is instantiated from, get's the system time.
     */
    public SchoolTime() {
        this.time = LocalTime.now();
    }

    /**
     * Constructor than when class is instantiated from, the client enters the required {@code int} values
     * that constitute a time, without the seconds, since clients usually speak in terms of time, as hours and minutes.
     * In this case, seconds will be set as default 0.
     *
     * @param hour   hour
     * @param minute minute
     */
    public SchoolTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    /**
     * Constructor than when class is instantiated from, the client enters the required {@code int} values
     * that constitute a time.
     *
     * @param hour   hour
     * @param minute minute
     * @param second seconds
     */
    public SchoolTime(int hour, int minute, int second) {
        time = LocalTime.of(hour, minute, second);
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
        return time.getMinute();
    }

    /**
     * getter / accessor method that returns the seconds
     *
     * @return seconds {@code int}
     */
    public int getSeconds() {
        return time.getSecond();
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
        time = time.withHour(hour);
    }

    /**
     * Setter / mutator method that changes the minutes
     *
     * @param minutes minutes
     */
    public void setMinutes(int minutes) {
        time = time.withMinute(minutes);
    }

    /**
     * Setter / mutator method that changes the seconds
     *
     * @param seconds hour
     */
    public void setSeconds(int seconds) {
        time = time.withSecond(seconds);
    }

    @Override
    public String toString() {
        //TODO: Provide local format to system
        return String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
    }
}
