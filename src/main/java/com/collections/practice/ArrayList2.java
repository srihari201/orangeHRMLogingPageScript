package com.collections.practice;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayList2 {
    public static void main(String[] args) {


        java.util.ArrayList<java.lang.Integer> mylist=new java.util.ArrayList<java.lang.Integer> ();
        mylist.add(4);
        mylist.add(6);
        mylist.add(6);

        //System.out.println(mylist.get(1));

        java.util.Map mymap=new java.util.HashMap();
        for(Object x:mylist){
            java.lang.System.out.println(x);
        }
        List myref= mylist.stream().distinct().collect(Collectors.toList());
        System.out.println(myref);



    }
}
