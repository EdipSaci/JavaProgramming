package utilities;

import day40_FinalKeyWord.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(ProtectedAccessModifier.name1);//default is not visible outside the package
        System.out.println(ProtectedAccessModifier.name2);// protected access modifier is visible outside the package with subclass ONLY

        //AccessModifier_Test4.method1();
        AccessModifier_Test4.method2();

    }
}
