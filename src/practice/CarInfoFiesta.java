package practice;

public class CarInfoFiesta {
    public static void main(String[] args) {

        int year =2013,
            Miles = 130000;
        String Make = "Ford",
               Model = "Fiesta",
               Color= "White",
               Price= "350000TL",
               ownerName= "Edip SAÇİ";


        System.out.println(ownerName +"'s " +year +" "+ Make+" "+ Model+", "+Color+ ", "+Price+"." );

    }
}
/*
Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000
 */