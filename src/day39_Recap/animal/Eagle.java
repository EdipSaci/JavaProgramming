package day39_Recap.animal;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting snake");
    }

    public void watch(){
        System.out.println(getName()+ " is watching animals");
    }
}
