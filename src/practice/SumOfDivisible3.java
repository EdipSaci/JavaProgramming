package practice;

public class SumOfDivisible3 {
    public static void main(String[] args) {
        String str = "a123bcd237cd7812";

        int sum=0;

        String temp="";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                temp+=str.charAt(i)+"";
            }else str=str.substring(i);

            if (Integer.parseInt(temp)%3==0){
                sum+=Integer.parseInt(temp);
            }
            str=str.substring(i);

        }

        System.out.println(sum);
    }



}
