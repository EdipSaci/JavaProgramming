package practice;
import java.util.Scanner;
public class prefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        boolean exists = true;
        String prefix = str.substring(0,n);
        String str2 = str.substring(n);

        if(str2.contains(prefix)){
            System.out.println(exists);
        }else{
            System.out.println(!exists);
        }//WRITE YOUR CODE BELOW

        scan.close();
    }
}
