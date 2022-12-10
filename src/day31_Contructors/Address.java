package day31_Contructors;

public class Address {

    public String buildingNumber,street, city, state;
    public int zipCode ;

    public Address(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return  buildingNumber+ " "+ street + "\n"+ city + " "+ state+", "+ zipCode;
    }
}
