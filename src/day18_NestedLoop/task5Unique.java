package day18_NestedLoop;

public class task5Unique {
    public static void main(String[] args) {
        String str = "aabccdeef";

        String result ="";
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)== str.charAt(j)){
                    frequency++;
                    result+=""+str.charAt(i);
                    if (!(result.contains(result))){
                        System.out.println(result);
                    }
                }

            }
        }


    }
}
