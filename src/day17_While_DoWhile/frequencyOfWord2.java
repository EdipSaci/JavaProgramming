package day17_While_DoWhile;

public class frequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog ";
        int frequency = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String eachSub = str.substring(i, i + 3);
            //System.out.println(eachSub);
            if (eachSub.equals("Cat")) {
                frequency++;
            }
        }

        System.out.println(frequency);


    }
}