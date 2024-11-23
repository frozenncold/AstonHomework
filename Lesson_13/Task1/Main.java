package Lesson_13.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Buerak", "Buerak", "Granite", "Dynamics", "Saury", "Saury", "Sulk", "Supinator", "Sweet", "Sweet");

        Set<String> unique = new HashSet<String>(words);
        System.out.println("Уникальные слова: " + unique.toString());
        for(String el : unique) {
            System.out.println(el + ": " + Collections.frequency(words, el));
        }

    }
}
