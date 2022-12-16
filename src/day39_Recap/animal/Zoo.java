package day39_Recap.animal;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog("Coni","German","Small","black",'F',5);
        Cat cat = new Cat("Moly","Van","Small","White",'F',4);
        Eagle eagle=new Eagle("Kartal","Mountain","medium","white",'F',7);
        Tiger tiger = new Tiger("frenk","African","Middle","Orange-Black",'F',5);

        dog.bark();
        dog.eat();
        cat.meow();
        cat.eat();

        tiger.hide();
        tiger.hunt();
        tiger.drink();

        eagle.watch();
        eagle.drink();
        eagle.hunt();

    }
}
