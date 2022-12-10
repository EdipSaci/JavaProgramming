package replit;

public class UtopianTreee {
    public static void main(String[] args) {
        int year = 0;
        int growth = 0;
        int treeSize = 0;

        for (int i = 1; i <4; i++) {
            growth=1;
            year++;
            treeSize++;
            System.out.println("year "+ year + " - growth "+ growth + " cm");
            System.out.println("tree size: " + treeSize + " cm");
        }
        for (int i = 4; i <=10 ; i++) {
            growth=2;
            year++;
            treeSize+=growth;
            System.out.println("year "+ year + " - growth "+ growth + " cm");
            System.out.println("tree size: " + treeSize + " cm");
        }


    }
}
