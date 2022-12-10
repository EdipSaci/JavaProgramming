package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Edip SAÇİ",
                 buildingNumber = "7925",
                 streetName = "Jones Branch Dr",
                 city = "McLean",
                 state = "VA",
                 zipCode = "20125";

        // System.out.println(name + "\n" + buildingNumber + " " + streetName  + "\n" + city + ", " + state + " "+ zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName  + "\n" + city + ", " + state + " "+ zipCode;

        System.out.println(address);

    }
}
