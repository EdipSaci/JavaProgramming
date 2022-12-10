package day36_Inheritance.phone;

public class Iphone extends Phone{

    public void faceTime(long phoneNumber){
        System.out.println(model+ "  is face timing with  number "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model+" is face timing with " + email);
    }
}
