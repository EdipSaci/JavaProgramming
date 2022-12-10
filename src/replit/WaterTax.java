package replit;

import java.util.Scanner;

public class WaterTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
        in.close();
    }
    public static double waterTax(double units){
        double bill = 1;
        if (units<=50 && units>=0){
            bill=units*0.60;
        } else if (units>50 && units<100) {
            bill=units*0.90;
        } else if (units>100 && units<150) {
            bill= units*0.90+50;
        }else {
            bill= units*0.90+100;
        }
        return bill;

    }

}
