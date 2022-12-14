package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW( String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }

    public void breakDown(){
        System.out.println(brand+  " "+ model+ " is breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand+  " "+ model+ " is racing car");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to jump start " +brand+" "+model);
    }
}
/*
	2. BMW:
					extra methods:
						breaksDown()
						racing()
 */