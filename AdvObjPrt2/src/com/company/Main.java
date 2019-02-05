package com.company;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal();
	Dog dog = new Dog("Bob", true);
	Cat cat = new Cat("Carl");
	OrangeTabby tabby = new OrangeTabby("Chris");
	RussianBlue blue = new RussianBlue("Bobby");
	Garfiled garfiled = new Garfiled("Garfield");


	System.out.println("------------");
	System.out.println("Dog Class: ");
	System.out.println("------------");
	dog.dockedTail();
	dog.printName();
	dog.makeSound();
	dog.playFetch();
	System.out.println("------------");
	System.out.println("Cat Class: ");
	System.out.println("------------");
	cat.printName();
	cat.makeSound();
	cat.beHappy();
	cat.seeLaser();
	System.out.println("--------------------");
	System.out.println("Orange Tabby Class: ");
	System.out.println("--------------------");
	tabby.printName();
	tabby.makeSound();
	tabby.beHappy();
	tabby.seeLaser();
	System.out.println("--------------------");
	System.out.println("Russian Blue Class: ");
	System.out.println("--------------------");
	blue.printName();
	blue.makeSound();
	blue.beHappy();
	System.out.println("----------------");
	System.out.println("Garfield Class: ");
	System.out.println("----------------");
	garfiled.printName();
	garfiled.makeSound();
	garfiled.beHappy();

    }
}
