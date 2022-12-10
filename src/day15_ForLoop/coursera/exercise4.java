package day15_ForLoop.coursera;

public class exercise4 {
    public static void main(String[] args) {

        int a = 0;
        while (a<=12){
            switch (a){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days");
                    break;
                case 4:
                case 6:
                case 9:
                    System.out.println("30 days");
                    break;
                case 2:
                    System.out.println("28 days");
                default:
                    System.out.println("Invalid number");
            }
            a++;
        }
    }
}
