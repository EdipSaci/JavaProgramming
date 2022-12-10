package day36_Inheritance.animalTask;

public class Animal {
/*
Inheritance: to build IS A relation between classes (parent and child,  super and sub)
			easiest way to get rich ===> extends
			child class (sub class): can inherite all the variables & methods (visible) from the parent class
			parent class (super class): can not inherit anything from child class. conatin all the common features that are meant to be inherited
			Advantages:
			less codes,less memory usage
			improves the reusability
			clean
			easy to maintain

    import vs extends:
		import: borrowing
		extends: owning

	    inherit ->pass it through
	    import -> let using
     */


    public String name,breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+ "is eating");
    }

    public void drink(){
        System.out.println(name+ "is drinking");
    }

    public void move(){
        System.out.println(name+ "is moving");
    }

    public void sleep(){
        System.out.println(name+ "is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()

	Dog extends Animal:
			bark()

	Cat extends Animal:
			scratch()

	Tiger extends Animal:
			roar()

	Fish extends Animal:
			swim()
 */