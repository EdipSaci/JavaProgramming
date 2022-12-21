package day40_FinalKeyWord;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

    /* public void drink(){  // final method can not be overriding
        System.out.println(getName()+ " is drinking beer");
    }
    */
}

//eating dog food
