package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8Grade {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (Integer score : scores) {
            if (score <=100 && score>=90){
                gradeOfA.add(score);
                countA++;
            } else if (score <=90 && score>=80) {
                gradeOfB.add(score);
                countB++;
            } else if (score <=80 && score>=70) {
                gradeOfC.add(score);
                countC++;
            } else if (score <=70 && score>=60) {
                gradeOfD.add(score);
                countD++;
            }else {
                gradeOfF.add(score);
                countF++;
            }
        }
        System.out.println(countA +" A");
        System.out.println(countB+ " B");
        System.out.println(countC+ " C");
        System.out.println(countD+ " D");
        System.out.println(countF+ " F");

    }
}
