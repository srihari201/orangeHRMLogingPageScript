package com.programs;

public class WordOccurrence {

    static int count(String str, String word) {
        String a[] = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Execution will be started from main method by jvm");
        int wordCount = WordOccurrence.count("Happy world Happy Happy", "world");
        System.out.println("Occurrences of 'Happy': " + wordCount);
    }
}
