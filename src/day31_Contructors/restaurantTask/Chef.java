package day31_Contructors.restaurantTask;

public class Chef {
    public String name ;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+" is making an order");
    }
    public void washDishes(){
        System.out.println(name+ " is washing the dishes");
    }

    public String toString() {
        String result = "";
        if (fullTime){
            result+="full-time";
        }else result+="part-time";
        return "chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime status=" + result +
                '}';
    }

}
