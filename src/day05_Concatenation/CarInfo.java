package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
         int  year = 2018;
         String make = "Toyota",
                model= "Carmy",
                miles= "50000 miles",
                colour="Red",
                price="$19000";

        // System.out.println(year + " "+make +" " + model + ", " + miles + ", " + colour + ", "+ price);

         String carInfo = year + " "+make +" " + model + ", " + miles + ", " + colour + ", "+ price;
        System.out.println(carInfo);

    }
}
