package com.predifinedFunctionalInterfaces;

import java.util.Collections;
import java.util.List;

public class PersonServiceWithComparator {

    public static List<Person> getPersons(List<Person> persons){
        Collections.sort(persons, (o1,o2) -> o1.getName().compareTo(o2.getName()));
        return persons;
    }
}
