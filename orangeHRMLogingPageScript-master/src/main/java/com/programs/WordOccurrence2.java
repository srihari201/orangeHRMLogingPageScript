package com.programs;

public class WordOccurrence2 {

    public static int  count(String str,String word){


        String a[] = str.split("\\s+");
        int count=0;
        for(int i=0;i<a.length;i++ ){
            if(word.equals(a[i])){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method by JVM");
        int count=WordOccurrence2.count("more nature more happy and good laugh good health,word","good");
        System.out.println(count);
        System.out.println("Execution will be ended");
    }
}
