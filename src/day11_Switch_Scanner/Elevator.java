package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        String result = "";

        if (floorNum>=1 && floorNum<=3) {
            if (floorNum==1){
                result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNum==2) {
                result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            } else if (floorNum==3) {
                result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else{
            result ="Invalid Number";
        }

        System.out.println(result);
        System.out.println("-----------------------------");

        //solution 2

        switch (floorNum){
            case 1 :
                result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2 :
                result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result ="Invalid Number";

        }
        System.out.println(result);

        // solution 3
        System.out.println("-----------------------------");

        if (floorNum>=1 && floorNum<=3){
            switch (floorNum){
                case 1 :
                    result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2 :
                    result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
                    break;
                default:
                    result ="Invalid Number";
            }

        }else{
            result ="Invalid Number";

        }
        System.out.println(result);


    }
}
