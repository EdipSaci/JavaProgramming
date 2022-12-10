package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setInfo("Mercedes","benz", "black",2016,18000);

        System.out.println(car1);

        Car car2= new Car();
        car2.setInfo("BMW","X5","Blue",1995,25400);
        System.out.println(car2);//Car{brand='BMW', model='X5', color='Blue', year=1995, price=254000.0}

        Car car3= new Car();
        car3.setInfo("Audi","A5","Red",2005,17400);
        System.out.println(car3);

        // Car[] cars =  {car1,car2,car3};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList) {
            System.out.println(each.brand+ " : " +each.price);
        }

        System.out.println("-----------------------------------------------------------------");
//3:19
        /*
        Recall
        BMW :2005 -2008
        Mercedes: 1995-1997
         */
        carsList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("Mercedes") && p.year>=1995 && p.year<=1997);



    }
}
