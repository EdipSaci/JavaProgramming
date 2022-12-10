package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 6, 7, 88, 9, 4, 4, 5, 6, 1, 2,};
        int n = frequencyOfElement(arr, 1);
        System.out.println("frequency " + n);
    }

    //returns the frequency of  given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of  given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    //returns the frequency of  given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    //returns the frequency of  given element from the given array
    public static int frequencyOfElement(String [] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;

    }

}
