package practice.day16;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java Java Java";

        String word = str.substring(0,str.indexOf(" "));

        String temp="";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            temp+=str.charAt(i);
            if (temp.contains(word)){
                count++;
                str=str.substring(i);
            }
        }
        System.out.println(count);
    }
}
