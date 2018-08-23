package com.concordia.com.concordia.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {


    public static void main(String[] args) {
        List persons = new ArrayList();
        persons.add(new Person("bhanu",25,"Male"));
        persons.add(new Person("adams",35,"Other"));
        persons.add(new Person("venkatalakshmi",30,"Female"));

        Collections.sort(persons);

        for (Object person : persons) {
            System.out.println(person);
        }

        Collections.sort(persons,new PersonComparator());
        for (Object person : persons) {
            System.out.println(person);
        }

        Collections.sort(persons,Person.AGE_COMPARATOR);
        for (Object person : persons) {
            System.out.println(person);
        }
    }
}
