package replit;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Nanuk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }

    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {
        boolean m=false;
        int count=0;
        int boast1=0;
        for (String s : result) {
            if (!s.equalsIgnoreCase("nanuk")) boast1+=valueOf(s);
            if (s.equalsIgnoreCase("nanuk")) break;
        }
        for (String s : result) {
            if (s.equalsIgnoreCase("nanuk")) count++;
        }
        if ((count<=wayStones)&& (boast1>=boast)) m=true;
        return m;



    }

}
