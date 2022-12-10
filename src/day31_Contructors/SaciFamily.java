package day31_Contructors;

public class SaciFamily {
    public String name ,role, location;
    public int age ;
    public char happiness;
    public double salary;


    public SaciFamily(String name, String role, String location, int age, char happiness, double salary) {
        this.name = name;
        this.role = role;
        this.location = location;
        this.age = age;
        this.happiness = happiness;
        this.salary = salary;
    }

    public String toString() {
        return "SaciFamily{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", happiness=" + happiness +
                ", salary=$" + salary +
                '}';
    }


    public void living(){
        System.out.println(name + " is living "+ location);
    }

    public void money(){
        System.out.println(name + " have $"+ salary );
    }
}
