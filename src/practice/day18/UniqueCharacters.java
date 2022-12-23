package practice.day18;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                char each2= str.charAt(j);
                if (each==each2){
                    count++;
                }
            }
            if (count==1){
                result+=""+ each;
            }
        }
        System.out.println("result = " + result);
    }
}
