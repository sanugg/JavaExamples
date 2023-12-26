package com.company.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListExample {
    public static void main(String[] args) {
        // Create a Set
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");

        // Convert Set to List
        List<String> stringList = new ArrayList<>(stringSet);

        // Print the elements in the List
        System.out.println("List elements:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}