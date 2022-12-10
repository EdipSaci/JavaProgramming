package day21_ForEachLoop;

public class task3 {
    public static void main(String[] args) {
/*3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          MUST use for each loops

 */
        int[]  arr1= {1,2,3,4,5};
        int[]  arr2= {4,5,6,7,8};

        String result = "";
        for (int ar1 : arr1) {
            for (int ar2 : arr2) {
                if (ar1==ar2){
                    result+=ar1+ " ";
                }
            }
        }

        System.out.println(result);
    }
}
