package day39_Recap.animal;

public class Animal {

    private String name,breed,size,color;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Invalid name");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed==null){
            System.err.println("Invalid breed");
            System.exit(1);
        }
        if (breed.isEmpty()||breed.isBlank()){
            System.err.println("Invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null){
            System.err.println("Invalid color");
            System.exit(1);
        }
        if (color.isEmpty()||color.isBlank()){
            System.err.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='F'||gender=='M')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }

    public void eat(){
        System.out.println(name +" is eating");
    }
    public void drink(){
        System.out.println(name +" is drinking");
    }
    public void sleep(){
        System.out.println(name +" is sleeping");
    }
    public void move(){
        System.out.println(name +" is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
