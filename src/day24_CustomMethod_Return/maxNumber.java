package day24_CustomMethod_Return;

public class maxNumber {
    public static void main(String[] args) {

        int [] array = {1,5,9,7,78,44};
        maxNum(array);
    }
    public static int maxNum (int [] array){
        int maxNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxNum){
                maxNum=array[i];
            }
        }
        System.out.println(maxNum);
        return maxNum;
    }

}
