package day27_WrapperClasses;

public class Task3 {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        String letters= "";
        String digits="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
           if (Character.isLetter(each)){
               letters+=each+"";
           }
           if (Character.isDigit(each)){
               digits+=each+"";
           }
           if (!Character.isLetterOrDigit(each)){
               specialChars+=each+"";
           }
        }

        System.out.println("letters = " +  "\""+letters +"\"");
        System.out.println("digits = " + "\""+digits+"\"");
        System.out.println("specialChars = " + "\""+specialChars+"\"");



    }

}
