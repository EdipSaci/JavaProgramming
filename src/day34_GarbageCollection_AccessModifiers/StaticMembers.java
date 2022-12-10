package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    //class can be static.. only the inner class can be static
    int a ;
    static class class1{

    }

    public static int num =100;

    public static void method(){

    }

    static {

    }
}

class A{ //outer class  can not be static

    static class B{ // inner class
        public static void method1(){// if the method doesn't need any instance variable and doesn't need intance method we can make it static

        }
    }
}


class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}


