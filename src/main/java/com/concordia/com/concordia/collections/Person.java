package com.concordia.com.concordia.collections;

import java.util.Comparator;

class Person implements Comparable {

    public static final Comparator AGE_COMPARATOR = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Person p1 = (Person) o1;
            Person p2 = (Person) o2;
            return p1.getGender().compareTo(p2.getGender());
        }
    };
    private String name;
    private int age;
    private String gender;


    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int compareTo(Object o) {
        Person that = (Person) o;
        return this.name.compareTo(that.name);

    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.gender;
    }
}
