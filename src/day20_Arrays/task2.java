package day20_Arrays;

public class task2 {
    public static void main(String[] args) {
        /*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

        String each ="";
        String reverse = "";
        String[] classmates = {"Ahmet","Celil","Tek","Yol","Devrim","Arzu","Kemal","Harun","Musa","Ali"};
        for (int i = 0; i < classmates.length; i++) {
            each=classmates[i];

            for (int j = classmates[i].length()-1; j >=0 ; j--) {
                reverse+=classmates[i].charAt(j);

            }
            reverse+=" \n";
        }

        System.out.println(reverse);

    }
}
