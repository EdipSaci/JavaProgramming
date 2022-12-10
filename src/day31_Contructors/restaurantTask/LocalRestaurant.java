package day31_Contructors.restaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant1= new Restaurant("kamil","sincan",5);

        Server server1 = new Server("recep",123,25,true);
        Server server2 = new Server("yeliz",122,27,true);
        Server server3 = new Server("aysun",121,17,false);
        Server[] serversArray = {server1,server2,server3};

        restaurant1.hireServer(serversArray);

        Chef chef1= new Chef("orhan",221,29,false);
        Chef chef2= new Chef("Yelda",222,32,true);
        Chef chef3= new Chef("Demet",223,35,true);
        Chef [] chefsArray = {chef1,chef2,chef3};
        restaurant1.hireChef(chefsArray);

        System.out.println(restaurant1);
    }
}
