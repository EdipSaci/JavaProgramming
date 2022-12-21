package day40_FinalKeyWord;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    /*
    Encapsulation: data hiding
			   give private access modifier to fileds
			   generate public getter/setters to read/write the private fileds

	using thge data:
		reading the data
		writing the data
     */

    private Circle circle;
    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if (circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }


    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
