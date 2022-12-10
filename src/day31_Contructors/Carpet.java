package day31_Contructors;

public class Carpet {

    public double width, length, unitPrice;
    public  boolean isPersian;

    //     "Carpet" should be same with class name
    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double calcCost=0;
        if (isPersian){
            calcCost=width*length*unitPrice+200;
        }else {
            calcCost=width*length*unitPrice;
        }
        return calcCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Cost=$" + calcCost() +
                '}';
    }
}
