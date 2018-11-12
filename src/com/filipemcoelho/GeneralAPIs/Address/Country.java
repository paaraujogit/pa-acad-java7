package com.filipemcoelho.GeneralAPIs.Address;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Country {

    private static Set<Country> countries = new Set<Country>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Country> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Country country) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Country> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    private String country;

    //TODO: Find on an array of Countries, if not available add to it

    //Constructor
    private Country(String country) {
        this.country = country;
    }

    //Getter
    public String getCountry() {
        return country;
    }

    //Setter
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return String.format("%s", getCountry());
    }

    public static Country newCountry(String country){
        Country instance = new Country(country);
        countries.add(instance);
        return instance;
    }

}
