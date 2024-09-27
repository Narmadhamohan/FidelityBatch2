package com.demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PeopleList {

    public static void main(String[] args) {
        List<String> people = new LinkedList<>();
        people.add("John");
        people.add("Jane");
        people.add("Bob");
        people.add("Mary");
        people.add("Jack");
        Repository dbObj = new Repository();
       int save =  dbObj.saveToDB(people);

       for(String name: people){
           System.out.println(name);
       }

    }
}
