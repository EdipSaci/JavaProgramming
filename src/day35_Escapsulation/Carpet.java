package day35_Escapsulation;

public class Carpet {

    /* Encapsulation:
              hiding the fields by giving private access modifiers
			  use getter/setter to read/write the private data
     */
    private double width, length, unitPrice;
    private boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
       setWidth(width);
       setLength(length);
       setUnitPrice(unitPrice);
       setPersian(isPersian);
    }

    /*
    Getter (Read Only): public instance method
			  					  Return type is not void
			  					  Return type must match with private instance variable' data type
			  					  Does not pass any parameter
			  					  Returns the private instance variables value

     */
    public double getWidth() {
        return width;
    }

    /*
    Setter (Write Only): public instance method
			  					   Return type is void
			  					   Passes a parameter
			  					   Parameter' data type must match with private instance variable' data type
			  					   reassigns the private instance variable to given argument

     */
    public void setWidth(double width) {
        if (width<0) return;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0) return;
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0) return;
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost(){
        double totalCost =(width*length)*unitPrice;
        if (isPersian) totalCost+=200;
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost =" + calcCost() +
                '}';
    }
}
