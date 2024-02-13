package com.java.oops;

public class Student {
    java.lang.String sName;
    int sRollNumber;
    char  sGrade;

    public void show(String sn, int rn, char sG){
        sName=sn;
        sRollNumber=rn;
        sGrade=sG;

        java.lang.System.out.println("\nStudent Name is: " + sName + "\nStudent RollNumber is: " + sRollNumber + "\nStudent Grade is: " + sGrade +"\n");
    }




}
