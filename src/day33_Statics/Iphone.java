package day33_Statics;

public class Iphone {

    public static String brand= "Apple";

    public String model;
    public double price;
    public static String OS ="IOS";
    public String color ;
    public String size;
    public static String madeIN= "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isFaceTime = true;
/*
    public static void printModelAndPrice(){
        System.out.println(model+ " : "+ price);  // static method does not accept instances
    }
  */
    public void method1(){
        System.out.println(model+ " : "+ price);
        System.out.println(OS); // we can use static variable for ,instance method
        System.out.println(isFaceTime);
    }

    public static void printOperatingSystem(){ // we ca not use instance variable for static method
        System.out.println(OS);
    }

}
