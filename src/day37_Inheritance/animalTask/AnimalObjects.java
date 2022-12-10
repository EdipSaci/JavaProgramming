package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("Max","Husky",'M',5,"Small","Black");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1=new Cat("Ter","Siamese",'F',5,"Large","White");
        System.out.println(cat1);
        cat1.scratch();
        //cat1.bark();

        Parrot parrot1=new Parrot("Risto","Macaw",'F',7,"Medium","Red","Blue");
        System.out.println(parrot1);
        parrot1.sing();
    }
}
