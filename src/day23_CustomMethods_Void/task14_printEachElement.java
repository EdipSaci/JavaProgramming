package day23_CustomMethods_Void;

public class task14_printEachElement {
    public static void main(String[] args) {

       printEachElement(new int[]{25,2,4,7});
    }
    public static void printEachElement (int [] array){
        for (int each : array) {
            System.out.print(each + " ");
        }
    }
}
