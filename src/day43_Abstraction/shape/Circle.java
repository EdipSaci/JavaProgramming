package day43_Abstraction.shape;

public final class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Invalid radius: "+ radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" +  area()+
                ", perimeter=" +  perimeter()+
                '}';
    }
}
