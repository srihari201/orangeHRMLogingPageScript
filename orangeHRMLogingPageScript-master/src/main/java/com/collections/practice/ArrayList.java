package com.collections.practice;

public class ArrayList {
    public static void main (String args[]){
        java.util.ArrayList listItems= new java.util.ArrayList(); //it will store heterogeneous data
        listItems.add("Happy");
        listItems.add("Happy");
        listItems.add("HelloWorld");


        java.lang.System.out.println(listItems);
        java.lang.System.out.println(listItems.get(1));

        for(Object x:listItems){
            java.lang.System.out.println(x);
        }
        System.out.println();

        java.util. List<String> fruitsToAdd = java.util.Arrays.asList("Mango", "Grapes", "Pineapple");
        System.out.println(fruitsToAdd);
        listItems.addAll(2, fruitsToAdd);

        System.out.println("ArrayList after adding new elements at index 2: " + listItems);
    }




}

