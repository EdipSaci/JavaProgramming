package day31_Contructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {

        // create 100 pizza objects size  'S', cheese topping 2 ,  peperoni topping 3
        // create 100 pizza objects size  'M', cheese topping 3 ,  peperoni topping 4
        // create 100 pizza objects size  'L', cheese topping 4 ,  peperoni topping 5

        ArrayList<Pizza> pizzas= new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',3,4);
            Pizza large = new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(small,medium,large));

        }

        System.out.println(pizzas.size());
        double totalPrice = 0;

        for (Pizza each : pizzas) {
            totalPrice+=each.calcCost();
        }
        System.out.println("totalPrice =  " + totalPrice);



    }
}
