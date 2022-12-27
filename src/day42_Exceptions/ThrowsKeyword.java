package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        /*
        try & catch: used for handling checked & unchecked exceptions
            permanent solution

        throws: used for handling checked exceptions ONLY

						Caller of the method will be responsible for handling the exception
         */

        System.out.println("----------Test 1 ----------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("------------Test 1 Completed---------------");

        System.out.println("----------Test 2 ----------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 10");

        System.out.println("------------Test 2 Completed---------------");


    }
}
