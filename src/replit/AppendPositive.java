package replit;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));
        in.close();
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> result = new ArrayList<>(list);
        result.removeIf(p-> p <0 || p ==0);

        int total = 0;
        for (Integer each : result) {
            total+=each;
        }
        result.add(total);
        return result;


    }

}
