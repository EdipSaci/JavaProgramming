package day35_Escapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping,numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if   (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")|| size.equalsIgnoreCase("Large") )){
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (size.equalsIgnoreCase("small")){
            if (numberOfCheeseTopping<0 || numberOfCheeseTopping>3){
                return;
            }
        }else if (size.equalsIgnoreCase("medium")){
            if (numberOfCheeseTopping<0 || numberOfCheeseTopping>4){
                return;
            }
        }else if (size.equalsIgnoreCase("large")){
            if (numberOfCheeseTopping<0 || numberOfCheeseTopping>5){
                return;
            }
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (size.equalsIgnoreCase("small")){
            if (numberOfPepperoniTopping<0 || numberOfPepperoniTopping>4){
                return;
            }
        } else if (size.equalsIgnoreCase("medium")) {
            if (numberOfPepperoniTopping<0 || numberOfPepperoniTopping>5){
                return;
            }
        } else if (size.equalsIgnoreCase("large")) {
            if (numberOfPepperoniTopping<0 || numberOfPepperoniTopping>6){
                return;
            }
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calCost(){
        int cost = (2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping);
        if (size.equalsIgnoreCase("small")){
            cost+=10  ;
        } else if (size.equalsIgnoreCase("medium")) {
            cost+=12;
        } else if (size.equalsIgnoreCase("large")) {
            cost+=14;
        }
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost= " + calCost() +
                '}';
    }
}
