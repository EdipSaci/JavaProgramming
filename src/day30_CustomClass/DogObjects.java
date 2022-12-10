package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 =new Dog();
        dog1.name ="Lucy";
        dog1.breed="Husky";
        dog1.age=4;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color= "White";

        Dog dog2=new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size= "Medium";
        dog2.color= "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German",5,'F',"Large","Black");

        System.out.println(dog1);//Dog{name='Lucy', breed='Husky', age=4, gender=F, size='Small', color='White'}
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();//Lucy is eating
        dog2.bark();//Ace is barking

        Dog dog4=new Dog();
        dog4.setInfo("Sully","Pit-Bull",5,'F',"Small","Brown");
        Dog dog5=new Dog();
        dog5.setInfo("Bullet","Labrador",3 ,'M',"Extra Large","Yellow");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs= new ArrayList<>();
        for (Dog each : dogs) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }
        }
        System.out.println(femaleDogs);

        ArrayList<Dog> maleDogs= new ArrayList<>(Arrays.asList(dogs));

        maleDogs.removeIf(p-> p.gender=='F');
        System.out.println(maleDogs);

    }
}
