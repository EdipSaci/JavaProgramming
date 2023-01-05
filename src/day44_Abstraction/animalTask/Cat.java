package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable{

    @Override
    public void play() {
        System.out.println(getName()+" is playing with sugar");
    }

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eats biryani ");
    }

}
