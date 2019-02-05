package com.company;



/**
 * Created by mr6900 on 2/5/2019.
 */
public class OrangeTabby {
    String species;
    String name;

    public OrangeTabby(String name) {
        species = "Cat";
        this.name = name;
    }
    //This method prints out the sound the animal makes
    public void makeSound(){
        System.out.println("Meow");
    }//This method will print the name of the animal onto the screen
    public void printName(){
        System.out.println(name);
    }
    public void beHappy(){
        layOnLap();
        System.out.println("*takes a nap*");
    }
    public void layOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }
    public void seeLaser(){
        System.out.println("*Cat pounces*");
    }
}
