package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String Size = "all",
                result = "";
        //solution 1

        if (Size == "tall" || Size == "grande" || Size == "venti" || Size == "venti") {
            if (Size == "tall") {
                result = "price is $3.69";
                result = "90 calories";
            } else if (Size == "grande") {
                result = "price is $3.99";
                result = "120 calories";
            } else if (Size == "venti") {
                result = "price is $4.29";
                result = "150 calories";
            }
            }else {
            result = "Invalid Size";

        }

        System.out.println(result);

        System.out.println("-----------------------");
        //solution 2

        switch (Size) {

            case "tall":
                result = "price is $3.69";
                result = "90 calories";
                break;
            case "grande":
                result = "price is $3.99";
                result = "120 calories";
                break;
            case "venti":
                result = "price is $4.29";
                result = "150 calories";

            default:
                result = "Invalid Size";
        }
        System.out.println(result);

        System.out.println("-----------------------");
        // solution 3
        if (Size == "tall" || Size == "grande" || Size == "venti" || Size == "venti"){

            switch (Size){
                case "tall":
                    result = "price is $3.69";
                    result = "90 calories";
                    break;
                case "grande":
                    result = "price is $3.99";
                    result = "120 calories";
                    break;
                case "venti":
                    result = "price is $4.29";
                    result = "150 calories";
            }


        }else {
            result = "Invalid Size";
        }


        System.out.println(result);

    }
    }
