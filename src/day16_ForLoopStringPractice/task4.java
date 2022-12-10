package day16_ForLoopStringPractice;

public class task4 {
    public static void main(String[] args) {
        String sentence = "Java Java Java";
        String result = "";
        int frequency = 0;


        for (int i = 0; i <= sentence.length() - 4; i++) {
            String java = sentence.substring(i, i + 4);
            if (java.equals("Java")) {
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}