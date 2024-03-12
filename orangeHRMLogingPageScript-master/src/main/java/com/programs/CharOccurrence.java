package com.programs;

public class CharOccurrence {
    public static void main(String[] args) {
        String s="Hello world";
        int totalLength=s.length();
        System.out.println(totalLength);
        int totalLengthAfterRemoval= s.replace("l","").length();
        System.out.println(totalLengthAfterRemoval);
        int totalOccurrence=totalLength-totalLengthAfterRemoval;
        System.out.println("Total occurrence of character l is: " + totalOccurrence);
    }
}
