package day38_Inheritance.animalTask;

public class Cat extends Animal{
    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats cat food");
    }
}
