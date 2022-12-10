package replit;

import java.util.Scanner;

public class catsAndDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i <= str.length()-3; i++) {
            String each= str.substring(i,i+3);
            if (each.equals("cat")){
                countCat++;
            }
            if (each.equals("dog")){
                countDog++;
            }
        }if (countCat==countDog){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        scan.close();
    }
}
