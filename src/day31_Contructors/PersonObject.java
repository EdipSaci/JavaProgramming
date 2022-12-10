package day31_Contructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1=new Person("Yusuf",'M',25);
        Person person2=new Person("Kemal",'M',32);

        person2.age=30;

        System.out.println(person1);
        System.out.println(person2);

    }
}
