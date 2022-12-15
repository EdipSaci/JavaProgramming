package day38_Inheritance.shapeTask;

public class Shape {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
        }
        if (name.isBlank()|| name.isEmpty()){
            System.err.println("Invalid name");
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return " ";

    }
}
