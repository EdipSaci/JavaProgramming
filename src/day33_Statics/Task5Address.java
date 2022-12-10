package day33_Statics;

public class Task5Address {

    public String street, buildingNumber, city, state;
    public double zipCode;
    public static String county = "Turkey";
    public static String planet = "Earth";

    public Task5Address(String street, String city, String state, double zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}