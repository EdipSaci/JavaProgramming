package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(5);

        System.out.println("------------------------");
        ageOfPerson(1990);
        System.out.println("------------------------");
        printNumbers(15,25);
    }


    // create function that can check if a number is  odd number or even number
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+ " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }

    //create a function that can display the age of person
    public static void ageOfPerson(int birthYear){
        int age =2022 -birthYear;
        System.out.println("Your age is "+ age);
    }


    //create a function that can print all the numbers between X to Y
    public static void printNumbers(int x ,int y){
        if (x>y){
            for (int i = y; i <=x ; i++) {
                System.out.println(i);
            }
        }else
            for (int i = x; i <=y ; i++) {
                System.out.println(i);
            }
    }

}
