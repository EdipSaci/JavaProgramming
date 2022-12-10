package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (char x = 'A' ;x<= 'Z'; x++){
            System.out.print(x +" ");
        }

        System.out.println();
        System.out.println("----------------------------------------");
        for (int a = 65 ; a<=90 ; a++){
            System.out.print((char)a + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        for (char a = 'z' ; a>= 'a' ; a--){
            System.out.print(a+ " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------");

    }
}
