package com.java.oops.Inheritance.java;

public class MultiLevelInheritance {
    String performance="good";


    public void firstRoundInterview() {
        System.out.println("First round interview method body started");

        System.out.println( "The performance is  " + performance);
        System.out.println("The performance is good and cleared the first interview");

    }

    public void SecondRoundInterview() {
        System.out.println("Second round method body started");
        System.out.println( "The performance is  " + performance);
        System.out.println("The performance is good and cleared the second interview ");

    }
}

class MultiLevelInheritance2 extends  MultiLevelInheritance{
    public void thirdRoundInterview(){
        System.out.println("Third round interview method body started");
        System.out.println("The performance is  " + performance);
        if(performance=="good"){
            System.out.println("The performance is good and cleared the third round");
        }
        else {
            System.out.println("Try for the next company");
        }
    }}
class MultiLevelInheritance3 extends  MultiLevelInheritance2{
    public void mangerRound(String performance){
        System.out.println("entered into manger round body ");
        if(performance=="good"){
            System.out.println("The performance is good and cleared the manager round as well got the job with 100% hike ");


        }
    }
}
class MainClass1 extends  MultiLevelInheritance3{
    public static void main(String[] args) {
        System.out.println("Execution will be started from main method by JVM");
        MultiLevelInheritance3 m3=new MultiLevelInheritance3();
        m3.firstRoundInterview();
        System.out.println();
        m3.SecondRoundInterview();
        System.out.println();
        m3.thirdRoundInterview();
        System.out.println();
        m3.mangerRound("good");
        System.out.println("Execution will be ended");
    }
}


