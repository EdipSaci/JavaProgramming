package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
        //double > float > long > int > short > byte
        // age:38 years old
        byte age = 38;

        // weight: 160 pounds

        // byte  weight = 160; 160 is out of byte range byte=-128 to 127
        short weight = 160;   // 160 is within the rang of short

        //salary: 100000 $
        int salary = 100_000;  // int is the  preferred data type for integer numbers

        long asset = 3_333_333_333L;

        float tax = 0.26F;
        double PI = 3.14;
        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 33000;
        System.out.println("ch3 = " + ch3);

        char gender =  'F';
        char yesNo = 'Y';
        System.out.println(yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300 ;
        System.out.println("result = " + result);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);

        String name = "Wooden Spoon";
        String city = "Mclean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);
/*

primitives:
	int: for integers
	double: for decimals
	char: for single characters, ''
	boolean: true/false

String: sequence of characters (String of text), ""
 */
    }

}
