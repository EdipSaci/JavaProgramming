package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    //if there is common value for all the objects then I can declare the static value

    //used for initializing static variables
    // gets executed as son as the class is loaded
    // runs first before everything, only runs one time
    //if the static variables need several steps to be initialized
    public static void main(String[] args) {

        System.out.println("Main Method");

    }



    static { // runs first before anything and only runs one time
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block2");
    }
    static {
        System.out.println("Static Block3");
    }
}
