package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota= new Toyota("Camry","blue",2020,12358,20000);

        Tesla tesla= new Tesla("Model S","black",2022,0,94990);

        BMW bmw =  new BMW("X5","white",2019,1244,19000);

        toyota.start(); //Twist the key to ignition Toyota Camry
        tesla.start();//Say  "start " Model S
        bmw.start();//Call mechanic to jump start BMW X5
    }
}
