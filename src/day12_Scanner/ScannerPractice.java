package day12_Scanner;

//import java.util.*; // wild import : imports everything from package
import java.util.Scanner;  // regular import :imports one class
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");
        int num= scan.nextInt();
        String result ="";

        if (num>=1 && num<=7){
            result =(num==1)? "Monday"   :(num==2)? "Tuesday" :(num==3)?"wed" :(num==4)?"thu"
                    :(num==5)?"fri" :(num==6)?"sat" : "sun";


        }else{
            result= "Invalid Number";
        }

        System.out.println(result);

        scan.close();



    }
}
