package com.java.oops.keywordsAndstatement.java;

public class SuperStatement {
    int a = 20;
    int b = 30;
}
class SuperStatement1 extends  SuperStatement{
    SuperStatement1(int x){
        super();
        System.out.println(x);
    }}
class SuperStatement2 extends SuperStatement1{

    SuperStatement2(int y, double b){
        super(600);
        System.out.println(y);
        System.out.println(b);



    }
}

class MainClas5{
    public static void main(String[] args) {
        SuperStatement2 s2=new SuperStatement2(100,20.5);





    }
}
