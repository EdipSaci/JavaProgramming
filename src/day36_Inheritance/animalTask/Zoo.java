package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"small","Black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.bark();
        //dog.hunt();
        //dog.scratch();


        Cat cat =new Cat();
        cat.setInfo("Pisik","ver",'F',5,"Small","white");
        cat.eat();
        cat.drink();
        cat.meow();
        //cat.hunt;
        //cat.bark;
        cat.scratch();

        Tiger tiger =new Tiger();
        tiger.setInfo("Sher","Bengal",'M',4,"large","Red");
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        //tiger.bark;
    }

}
