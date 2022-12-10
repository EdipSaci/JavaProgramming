package day35_Escapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private  int quantity;


    public Item(String name, double unitPrice, int quantity) {
       setName(name);
       setUnitPrice(unitPrice);
       setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()) return;
        char [] arr = name.toCharArray();
        if (!(Character.isLetter(arr[0]))) return;
        for (char each : arr) {
            if (!Character.isLetterOrDigit(each) && each != ' ') return;
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0) return;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            return;
        } else if (name.equalsIgnoreCase("toilet paper") && quantity>1){
            return;
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}
