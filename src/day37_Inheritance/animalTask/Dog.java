package day37_Inheritance.animalTask;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }


    /*
this keyword: refers to the instances. Current class
	this. : calls instance variables & instance methods
	this() : calls the constructor of current class


super keyword: refers to the instances. parent class
	super. :calls instance variables & instance methods of super class
	super() : calls the constructor of parent class

     */
}
