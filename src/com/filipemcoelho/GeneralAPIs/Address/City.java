package com.filipemcoelho.GeneralAPIs.Address;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class City {

    private static Set<City> cities = new Set<City>() {
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
        public Iterator<City> iterator() {
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
        public boolean add(City city) {
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
        public boolean addAll(Collection<? extends City> c) {
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

    private String city;

    //Constructor
    private City(String city) {
        this.city = city;
    }

    //Getter
    public String getCity() {
        return city;
    }

    //Setter
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return String.format("%s", getCity());
    }
    //Provide new instance
    public static City newCity(String city){
        City instance = new City(city);
        cities.add(instance);
        return instance;
    }
}
