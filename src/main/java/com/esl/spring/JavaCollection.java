package com.esl.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author bhanu
 **/
public class JavaCollection {
    private List<Person> persons;
    private Set<Person> personsSet;
    private Map<String,Person> personMap;
    private Properties properties;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Set<Person> getPersonsSet() {
        return personsSet;
    }

    public void setPersonsSet(Set<Person> personsSet) {
        this.personsSet = personsSet;
    }

    public Map<String, Person> getPersonMap() {
        return personMap;
    }

    public void setPersonMap(Map<String, Person> personMap) {
        this.personMap = personMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
