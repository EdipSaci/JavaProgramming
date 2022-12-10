package day31_Contructors.restaurantTask;

import java.util.ArrayList;

public class Restaurant {
    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs= new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer( Server[] serverArray){
        for (Server eachServer : serverArray) {
            servers.add(eachServer);
        }
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefArray){
        for (Chef each : chefArray) {
            chefs.add(each);
        }
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID);
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
