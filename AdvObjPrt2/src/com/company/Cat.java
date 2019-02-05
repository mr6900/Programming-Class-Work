package com.company;

/**
 * Created by mr6900 on 2/5/2019.
 */
public class Cat {
    String species;
    String name;


    public Cat(String name){
        species = "Cat";
        this.name = name;
    }
    //This method prints out the sound the animal makes
    public void makeSound(){
        System.out.println("Meow");
    }
    //This method will print the name of the animal onto the screen
    public void printName(){
        System.out.println(name);
    }
    public void beHappy(){
        System.out.println("purrrr");
        seeLaser();
        makeSound();
    }
    public void seeLaser(){
        System.out.println("*Cat pounces*");
    }

}
