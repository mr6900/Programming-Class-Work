package com.company;

/**
 * Created by mr6900 on 2/5/2019.
 */
public class Animal {
    String species;
    String name;

    public Animal(){
        name = "";
        species = "";
    }
    //This method prints out the sound the animal makes
    public void makeSound(){
        System.out.println("Grrr");
    }
    public void printName(){
        System.out.println(name);
    }
}
