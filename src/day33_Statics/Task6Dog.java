package day33_Statics;

public class Task6Dog {

    public String name ,breed, color;
    public char size, gender;
    public int age;

    public static int numberOfLegs=4;
    public static int numberOfEyes =2;
    public static boolean numberOfWings =false;
    public static boolean isFriendly =true;

    public Task6Dog(String breed,String name, String color, char size, char gender, int age) {
        this.breed = breed;
        this.name=name;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void play(){
        System.out.println(name+" is playing");
    }


    public String toString() {
        return "Task6Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
