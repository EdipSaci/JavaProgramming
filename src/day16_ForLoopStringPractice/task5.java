package day16_ForLoopStringPractice;

public class task5 {
    public static void main(String[] args) {

        String str = "caT dog doG cAt";

        str= str.toLowerCase();

        int frequencyCat = 0;
        int frequencyDog = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String each =str.substring(i,i+3);
            if (each.equals("cat")){
                frequencyCat++;
            } else if (each.equals("dog")) {
                frequencyDog++;
            }
        }
        if (frequencyCat==frequencyDog){
            System.out.println("true");
        }else {
            System.out.println("false");
        }




    }
}
