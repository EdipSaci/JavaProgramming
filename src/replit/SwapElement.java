package replit;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

        in.close();
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        ArrayList<String> result = new ArrayList<>(list);

        String a =result.get(pos1);
       String b = result.get(pos2);

       result.set(pos1,b);
       result.set(pos2,a);
       return result;
    }
}