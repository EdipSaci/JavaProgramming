package day38_Inheritance.animalTask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }
    @Override
    public void eat() {
        System.out.println(name+ " eats deer");
    }
}
