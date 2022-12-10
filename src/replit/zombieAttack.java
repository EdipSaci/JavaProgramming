package replit;
import java.util.*;
public class zombieAttack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        while (inhabitants>0){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            day++;
            inhabitants/=2;
        }
        System.out.println("---- EXTINCT ----");


  /*      for (int i = inhabitants; i >=1 ; i/=2) {
            int day =0;
            while (i==1) {
                day++;

            }
            System.out.println("Day "+ day +" " +i);
        }*/

        scan.close();


    }
}
