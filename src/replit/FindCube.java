package replit;
import java.util.Scanner;
public class FindCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
        in.close();

    }

    public static int max(int x, int y){

        int max = 0;
        if (x>y){
            max=x;
        }else{
            max=y;
        }
        return max;

    }
}
