package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Put one animal on the console: ");
        System.out.println("This is cat.");

        Cat cat = new Cat();
        cat.setName("Tommy");
        cat.setColoring("Grey");
        cat.setAge(4);
        cat.setAptitude("hunting mice");

        System.out.println("His name is,"+cat.getName());
        System.out.println("He is "+cat.getColoring());
        System.out.println("He is "+cat.getAge()+" year old");
        System.out.println("He "+cat.getAptitude());

    }
}
