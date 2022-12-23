package day27_WrapperClasses.officeHours;

public class WrapperClassMethods {

    public static void main(String[] args) {

        //autoboxing
        int a = 40;
        Integer b = a;

        //unboxing
        Integer c= 0;
        int d = c;

        /*
        1.parseInt(): converts String to primitive

        2.valueOf(): converts String to wrapper class,return object, Integer object
        3.toString(): take a int/Integer's string value (convert it to string object)
         */

        System.out.println(Integer.toString(123).concat("onetwothree"));//123onetwothree
        System.out.println(Integer.toString(123)+5);//1235

        String str= "123house258";
        int total=0;

        for (int i = 0; i < str.length(); i++) {
          if (Character.isDigit(str.charAt(i))){
              total+=Integer.valueOf(""+str.charAt(i));
              // or  total+=Integer.valueOf(str.charAt(i)-48);
          }
        }
        System.out.println("total = " + total); //21



    }
}
