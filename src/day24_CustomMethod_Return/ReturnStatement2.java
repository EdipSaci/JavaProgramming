package day24_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {

        months(10);

    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void months (int numberOfMonths){

        if (numberOfMonths<1 || numberOfMonths>12){
            System.out.println("Invalid");
            return; // exits months method ,remaining code fragments of the method never gets executed
        }

           String name = (numberOfMonths==1)? "Jan" :(numberOfMonths==2)? "Feb"  :(numberOfMonths==3)? "Mar" :(numberOfMonths==4)? "Apr" :(numberOfMonths==5)? "May" :(numberOfMonths==6)? "Jun" :(numberOfMonths==7)? "Jul" :(numberOfMonths==8)? "Aug" :(numberOfMonths==9)? "Sep" :(numberOfMonths==10)? "Oct" :(numberOfMonths==11)? "Nov": "Dec";

        System.out.println("Month Name: "+ name);
    }

}
