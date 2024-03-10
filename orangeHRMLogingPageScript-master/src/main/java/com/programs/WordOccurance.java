package com.programs;

public class WordOccurance {

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
        System.out.println("...............");
        int wordCount = WordOccurance.count("Happy world Happy", "Happy");
        System.out.println("Occurrences of 'Happy': " + wordCount);
    }
}
