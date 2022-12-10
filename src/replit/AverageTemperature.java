package replit;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double sum =0;
        for (double temp : temps) {

            sum+=temp;
        }
        double average = sum/temps.length;
        System.out.println(average);



        scan.close();

    }
}
