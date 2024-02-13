package com.java.oops.Inheritance.java;

public class HirearchicalInheritance {
    public void messagingApp(){
        System.out.println("messaging feasibility is there ");
    }}
class HirearchicalInheritance1 extends  HirearchicalInheritance{
    public void snap(){
        System.out.println("uploading snaps");
    }}

class HirearchicalInheritance2 extends  HirearchicalInheritance{
    public void whatsapp(){
        System.out.println("whatsapp calling");
    }}

class HirearchicalInheritance3 extends HirearchicalInheritance{
    public void telegram(){
        System.out.println("telegram calling");
    }}



class MainClass2 {
    public static void main(String[] args) {
        HirearchicalInheritance3 reference=new HirearchicalInheritance3();
        reference.messagingApp();
        reference.telegram();
        System.out.println();

        HirearchicalInheritance1 ref1=new HirearchicalInheritance1();
        ref1.messagingApp();
        ref1.snap();
        System.out.println();

        HirearchicalInheritance2 ref2=new HirearchicalInheritance2();
        ref2.messagingApp();
        ref2.whatsapp();


    }
}
