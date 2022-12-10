package replit;

import java.util.Scanner;

public class CountDublicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
            in.close();
        }
        System.out.println(getDup(strs));
    }
    public static int getDup(String[] arr) {
        int count = 0;
        int freq =0;

        for (String each : arr) {
            count=0;
            for (String a : arr) {
                if (a.equalsIgnoreCase(each)){
                    count++;
                }
            }
            if (count!=1){
                freq+= count/count;
            }
        }
        System.out.println(freq);
        return freq;
    }


}
