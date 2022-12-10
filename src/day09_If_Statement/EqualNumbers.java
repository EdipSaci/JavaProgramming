package day09_If_Statement;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 14, n2=5, n3 = 5 ;

        String result = "";

        if (n1==n2 && n1!= n3){
            result =("n1&n2 are equal");
        } else if (n2==n3 && n2!=n1) {
            result =("n2&n3 are equal");
        } else if (n1==n3 && n1!=n2) {
            result =("n3&n1 are equal");
        } else if (n1==n2 && n1==n3) {
            result =("all equal");
        } else {
            result =("none of them are equal");
        }


        System.out.println(result);
    }
}
