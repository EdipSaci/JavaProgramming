package day39_Recap.animal;

public class FriendlyAnimal extends Animal{

    private static boolean isWild=false,
            isFriendly=true,
            isPlayable=true;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void playing(){
        System.out.println(getName()+" is playing");
    }
    public void pet(){
        System.out.println(getName()+" likes being petted");
    }
}
