package day41_Exceptions;

public class FinallyBlock {
    /*
    Interview Question:
	   final     is a  keyword,(unchangeable) it is for variable, method, class
	   finally   is a block,
	   finalize  is a method--> GarbageColllector calls it and destroy it, every single object

	   How can use stop the finally from being executed?
	   you have to explicitly terminated right before finally block execution
	   System.exit(0)
     */

    public static void main(String[] args) {

        int [] arr = {1,2,3};

        try {
            System.out.println(arr[100]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }

    }
}
