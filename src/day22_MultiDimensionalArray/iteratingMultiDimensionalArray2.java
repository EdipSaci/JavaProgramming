package day22_MultiDimensionalArray;

public class iteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        //index of elements:   0 1 2    0 1 2 3 4    0 1  2   3   4
        int[][] arr2D =     { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
        //   index of arrays :  0          1            2

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index number of 1D arrays starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {//j : index num of elements
                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();
        }





    }
}
/*task1
9 10 11 12 13
4 5 6 7 8
1 2 3
task2
3 2 1
8 7 6 5 4
13 12 11 10 9
task3
13 12 11 10 9
8 7 6 5 4
3 2 1
 */