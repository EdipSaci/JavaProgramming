package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square= new Square(10);
        System.out.println(square);
        //Square{side='10.0', area='100.0', perimeter='40.0'}

        Rectangle rectangle= new Rectangle(5,8);
        System.out.println(rectangle);
        //Rectangle{length='5.0'width='8.0', area='40.0', perimeter='26.0'}
        System.out.println(rectangle.getName()); //Rectangle

        Circle circle = new Circle(34);
        circle.setRadius(2.9);
        System.out.println(circle.getRadius());//2.9
        System.out.println(circle);
        //Circle{radius='2.9', pi='3.14'area='26.4074'perimeter='18.212'}


    }
}
