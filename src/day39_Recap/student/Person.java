package day39_Recap.student;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!Character.isAlphabetic(ch) && ! Character.isSpaceChar(ch)){
                System.err.println("Invalid name");
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Invalid age");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender== 'F'|| gender=='M')){
            System.err.println("Invalid gender");
            System.exit(10);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
