package day18_NestedLoop;

public class task4Frequency {
    public static void main(String[] args) {
        String str = "aabcccd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j))
                    count++;
            }

            if (!(result.contains(str.charAt(i)+"")))
                result+=str.charAt(i)+ ""+count;
        }
        System.out.println(result);

    }
}