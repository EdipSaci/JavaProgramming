package day23_CustomMethods_Void;

public class task6_area {
    public static void main(String[] args) {

        circleArea(10);
    }

    public static void circleArea(int radius){
        double pi = 3.14;
        double area =radius*radius*pi;
        System.out.println("area of circle is = "+ area);
    }
}
