package day39_Recap.animal;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void  swim(){
        System.out.println(getName()+ " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating apple");
    }
}
