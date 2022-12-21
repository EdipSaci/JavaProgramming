package day40_FinalKeyWord;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name="Batch 10";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
        //final keyword  is unchangeable
        //pi=4.14; final variables can not be reassigned
        //pi=5.4;


        final String name ;
        name= "Java";
        // name= "Wooden Spoon";
        System.out.println(name);

        System.out.println("---------------------------------");
        FinalVariable obj=new FinalVariable("May/01");
        //obj.birthDay= "June/01" // final variabls con not be reassigned
        System.out.println(obj.birthDay);

        System.out.println("---------------------------------");
        //FinalVariable.name= "Python";
        System.out.println(FinalVariable.name);


    }
}
