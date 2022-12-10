package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {
    //whenever you have instance variable (each object has own copy)in order to set  you can use constructor to start them
    //whenever you have static variable in order to set  you can use static block
    static {
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
    }



}
