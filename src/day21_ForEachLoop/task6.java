package day21_ForEachLoop;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        /*
        6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
         */
        String sentence = "I love java. I also love python. But I think I love java more.";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int countJava= 0;
        int countPython= 0;

        for (String each : words) {
            if (each.toLowerCase().contains("java")){
                countJava++;
            }
            if (each.toLowerCase().contains("python")){
                countPython++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
