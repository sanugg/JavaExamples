package com.company.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentScores.put("John", 85);
        studentScores.put("Jane", 92);
        studentScores.put("Doe", 78);
        studentScores.put("Smith", 90);

        // Accessing elements
        System.out.println("John's score: " + studentScores.get("John"));

        // Modifying an element
        studentScores.put("John", 88);
        System.out.println("Updated John's score: " + studentScores.get("John"));

        // Removing an element
        studentScores.remove("Doe");

        // Iterating over the HashMap
        System.out.println("\nStudent Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        String studentName = "Jane";
        if (studentScores.containsKey(studentName)) {
            System.out.println("\n" + studentName + " is in the HashMap.");
        } else {
            System.out.println("\n" + studentName + " is not in the HashMap.");
        }

        // Checking if a value exists
        int scoreToCheck = 90;
        if (studentScores.containsValue(scoreToCheck)) {
            System.out.println(scoreToCheck + " is a score in the HashMap.");
        } else {
            System.out.println(scoreToCheck + " is not a score in the HashMap.");
        }
    }
}