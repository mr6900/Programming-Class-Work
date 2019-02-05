package com.company;

/**
 * Created by mr6900 on 2/5/2019.
 */
public class Dog {
    String species;
    String name;
    boolean dockedTail;

    public Dog(String name, boolean dockedTail){
        species = "Dog";
        this.name = name;
        this.dockedTail = dockedTail;
        }
    //This method prints out the sound the animal makes
        public void makeSound(){
        System.out.println("Woof");
        }
    //This method will print the name of the animal onto the screen
        public void printName(){
            System.out.println(name);
        }
        //this method prints out that the dog is playing
        public void playFetch(){
            System.out.println("*Chases ball 5 times then quits*");
        }
        //this method checks if the dog has a docked tail or not
        public boolean dockedTail() {
            dockedTail = dockedTail;
            return dockedTail;
        }

}


