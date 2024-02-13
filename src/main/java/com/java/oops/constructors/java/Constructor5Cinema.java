package com.java.oops.constructors.java;

public class Constructor5Cinema {
    String producer;
    String director;
    String hero;
    String actress;
    String musicDirector;
    String budget;
    int releaseDate;

    public Constructor5Cinema(String producer, String director, String hero, String actress, String musicDirector, String budget,int releaseDate ) {
        this.producer = producer;
        this.director = director;
        this.hero = hero;
        this.actress = actress;
        this.musicDirector = musicDirector;
        this.budget = budget;
        this.releaseDate=releaseDate;


        System.out.println("Local variable producer " + producer);
        System.out.println("Local variable director " + director);
        System.out.println("Local variable hero " + hero);
        System.out.println();


    }

    public static void main(String[] args) {
        Constructor5Cinema c5 = new Constructor5Cinema("DilRaju", "Srihari", "Srihari", "Mrunal", "Manisharma", "25cr",2025);
        System.out.println("producer " + c5.producer);
        System.out.println("director " + c5.director);
        System.out.println("hero " + c5.hero);
        System.out.println("actress " + c5.actress);
        System.out.println("musicDirector " + c5.musicDirector);
        System.out.println("budget " + c5.budget);
        System.out.println("releaseDate " + c5.releaseDate);
        System.out.println();

        Constructor5Cinema c6=new Constructor5Cinema("DVV Danayya","vatriman","Srihari","Andrea","MM Keeravani","100cr",2025);
        System.out.println("producer " + c5.producer);
        System.out.println("director " + c5.director);
        System.out.println("hero " + c5.hero);
        System.out.println("actress " + c5.actress);
        System.out.println("musicDirector " + c5.musicDirector);
        System.out.println("budget " + c5.budget);
        System.out.println("releaseDate " + c5.releaseDate);

    }



}

