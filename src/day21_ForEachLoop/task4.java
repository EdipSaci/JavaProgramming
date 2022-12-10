package day21_ForEachLoop;

public class task4 {
    public static void main(String[] args) {
        /*
        4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
         */
        String[] str = {"anna", "level", "Java", "kamil", "enne"};


        int count =0;
        for (String each : str) {
            String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
                if (reversed.equals(each)){
                    count++;
                }
            }
        }
        System.out.println(count);
        
        
    }
}
