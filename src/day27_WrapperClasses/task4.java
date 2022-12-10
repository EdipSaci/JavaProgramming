package day27_WrapperClasses;

public class task4 {
    public static void main(String[] args) {
        String str = "JAVA java";
        int upperCase =0;
        int loWerCase =0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)){
                upperCase++;
            }
            if (Character.isLowerCase(each)){
                loWerCase++;
            }

        }
        System.out.println(upperCase==loWerCase);
    }
}
