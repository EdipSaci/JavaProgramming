package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        String type = "US morning",
                result = "";
        if (type== "US morning" || type=="US evening" || type==" EU"){
            if (type== "US morning"){
                result="Class times are 10-5 EST. M, T, Th, F.";
            } else if (type=="US evening") {
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
            } else if (type=="EU") {
                result="Class times are  10-5 EST. M, T, W, Th, F.";
            }
        }else
            result="Invalid Batch";

        System.out.println(result);

        System.out.println("-------------------");
        //solution 2
        switch (type){
            case "US morning" :
                result="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result="Class times are  10-5 EST. M, T, W, Th, F.";
            default:
                result="Invalid Batch";
        }
        System.out.println(result);



    }
}
