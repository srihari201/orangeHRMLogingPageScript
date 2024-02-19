package com.java.oops;



public class Employee {
    String empName;
    int empId;
    String job;
    long sal;
    public void display(){
        System.out.println("employee name is : " +empName);
        System.out.println("employee id is : " + empId);
        System.out.println("employee job is : " + job);
        System.out.println("employee salary is : " + sal);

    }

    public static void main(String[] args){
        System.out.println("Execution will be started from main method \n");
        System.out.println("*****employee one details are below*****");
        Employee emp1=new Employee();
        emp1.empName="Srihari";
        emp1.empId=2402;
        emp1.job="QA";
        emp1.sal=1400000;
        emp1.display();
        System.out.println();

        System.out.println("*****employee two details are below*****");
        Employee emp2=new Employee();
        emp2.empName="Ramesh";
        emp2.empId=2202;
        emp2.job="qa";
        emp2.sal=1000000;
        emp2.display();
        System.out.println();

        System.out.println("Execution will be ended");
    }
}
