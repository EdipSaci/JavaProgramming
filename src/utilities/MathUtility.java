package utilities;

public class MathUtility {

    //return the sum of two integers
    public static int sumOfNumber(int num1, int num2){
        return num1+num2;
    }
    //return the sum of two double
    public static double sumOfNumber(double num1, double num2){
        return num1+num2;
    }


    //return the sub of two integers
    public static int subOfNumber(int num1, int num2){
        return num1-num2;
    }
    //return the sub of two double
    public static double subOfNumber(double num1, double num2){
        return num1-num2;
    }

    //return the multiple of two integers
    public static int multipleOfNumber(int num1, int num2){
        return num1*num2;
    }
    //return the multiple of two double
    public static double multipleOfNumber(double num1, double num2){
        return num1*num2;
    }

    //return the division of two double
    public static double divisionOfNumber(double num1, double num2){
        return num1/num2;
    }


    //check if an integer is even number
    public static boolean isEven (int number){
        boolean result =true;
        if (number%2!=0){
            result=false;
        }
        return result;
    }
    //check if an integer is odd number
    public static boolean isOdd (int number){
        boolean result =false;
        if (number%2!=0){
            result=true;
        }
        return result;
    }


    //return the maximum number between two integers
    public static int maximumNumber(int num1, int num2){
        int maxNumber =0;
        if (num1>num2){
            maxNumber=num1;
        }else maxNumber=num2;
        return maxNumber;
    }

    //return the maximum number between two double
    public static double maximumNumber(double num1, double num2){
        double maxNumber =0;
        if (num1>num2){
            maxNumber=num1;
        }else maxNumber=num2;
        return maxNumber;
    }

    //return the minimum number between two integers
    public static int minimumNumber(int num1, int num2){
        int minNumber =0;
        if (num1<num2){
            minNumber=num1;
        }else minNumber=num2;
        return minNumber;
    }

    //return the maximum number between two double
    public static double minimumNumber(double num1, double num2){
        double minNumber =0;
        if (num1>num2){
            minNumber=num1;
        }else minNumber=num2;
        return minNumber;
    }


    //return the square of an integer
    public static int squareOfNumber (int number){
        return number*number;
    }
    //return the square of an double
    public static double squareOfNumber (double number){
        return number*number;
    }


    //return the cube of an integer
    public static int cubeOfNumber (int number){
        return number*number*number;
    }
    //return the cube of an double
    public static double cubeOfNumber (double number){
        return number*number*number;
    }

}
