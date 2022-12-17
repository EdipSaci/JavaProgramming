package practice.day15;

public class SumEvenNum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                result+=i;
            }
        }
        return result;
    }

}
