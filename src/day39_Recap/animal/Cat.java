package day39_Recap.animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void scratch(){
        System.out.println(getName()+ " is scratching");
    }

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating food");
    }
}
