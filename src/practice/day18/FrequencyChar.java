package practice.day18;

public class FrequencyChar {
    public static void main(String[] args) {
        String str = "aabcccd";

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            int count =0;
            char each = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each2= str.charAt(j);
                if (each==each2){
                    count++;
                }

            }
            if (!(result.contains(each+"")))
                result+=each+ ""+count;
        }
        System.out.println(result);
    }
}
