package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200; // access modifier :default
    private static int privateData = 300;

/*

Access Modifiers: define the accessibility

		public > protected > default > private

	private: ONLY reachable within the same class

	default: ONLY reachable within the same package

	public: ALWAYS rechable
 */
    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){

    }

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
}
