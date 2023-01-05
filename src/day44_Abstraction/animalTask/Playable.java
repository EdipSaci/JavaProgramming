package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;  //We must initialize it at this line . static and finally by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }

     */

    void play();  //abstract by default

}