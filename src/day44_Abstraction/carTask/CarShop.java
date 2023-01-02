package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Toyota","Accord",1995,10000,"Blue");
        toyota.start();
        toyota.drive();

        System.out.println("---------------------------------------");

        Audi audi= new Audi("Audi","A3",2000,11000,"White");
        audi.drive();
        audi.start();
        audi.autoPark();

        System.out.println("---------------------------------------");

        Tesla tesla = new Tesla("Tesla","T23",2022,20000,"Black");
        tesla.drive();
        tesla.start();
        tesla.autoPark();
        tesla.selfDrive();

        System.out.println("---------------------------------------");

        CydeoCar cydeoCar= new CydeoCar("Cydeo","CyberCar",2023,25000,"Red");
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();



    }
}
