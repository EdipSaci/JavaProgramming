package day31_Contructors.restaurantTask;

public class Server {
    public String name ;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println(name +" is taking an order" );
    }
    public void cleanTable(){
        System.out.println(name+ " is cleaning the table");
    }

    public String toString() {
        String result = "";
        if (fullTime){
            result+="full-time";
        }else result+="part-time";
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime status=" + result +
                '}';
    }
}
