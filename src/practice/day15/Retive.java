package practice.day15;

public class Retive {
    public static void main(String[] args) {
        String str="mn@#123Ab!";

        String letters="";
        String digits="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (Character.isDigit(ch)){
                digits+=ch;
            }
            else if (Character.isLetter(ch)) {
                letters+=ch;
            }else {
                specialChars+=ch;
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
    }

}
