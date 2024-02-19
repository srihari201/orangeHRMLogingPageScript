package com.java.oops.encapsulation.java;

public class Encapsulation {
    private int acc_no;
    private String name;
    private double amount;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String args[]) {


        Encapsulation es = new Encapsulation();
        es.setAcc_no(1234);
        es.setAmount(1000);
        es.setName("ABC");
        System.out.println(es.getAcc_no());
        System.out.println(es.getAmount());
        System.out.println(es.getName());

    }
}
