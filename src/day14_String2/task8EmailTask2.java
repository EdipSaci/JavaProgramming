package day14_String2;

public class task8EmailTask2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String domain= email.substring(email.indexOf("@")+1,email.indexOf("."));

        firstName = firstName.toUpperCase().charAt(0)+ firstName.substring(1);
        lastName = lastName.toUpperCase().charAt(0)+ lastName.substring(1);



        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);

    }
}
