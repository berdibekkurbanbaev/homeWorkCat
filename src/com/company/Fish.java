package com.company;

public class Fish {
    private String name;
    private String coloring;
    private int age;
    private String aptitude;
    void setName (String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setColoring(String coloring){
        this.coloring = coloring;
    }
    String getColoring(){
        return coloring;
    }

    void setAge (int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setAptitude(String aptitude){
        this.aptitude = aptitude;
    }
    String getAptitude(){
        return aptitude;
    }

}
