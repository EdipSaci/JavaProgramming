package day23_CustomMethods_Void;

public class task13_printEachChar {
    public static void main(String[] args) {
        printEachChar("namık");
    }
    public static void printEachChar (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
    }
}
