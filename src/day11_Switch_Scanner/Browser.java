package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";
        boolean validBrowser = browserName=="chrome" || browserName=="fireworks" || browserName =="opera"||
                browserName =="safari"|| browserName =="edge";

        String result = "";

        if (validBrowser){
            if (browserName=="chrome") {
                result = "chrome browser is selected";
            } else if (browserName=="firewokrs") {
                result="firewokrs browser is selected";
            } else if (browserName== "opera") {
                result= "opera browser is selected";
            } else if (browserName=="safari") {
                result="safari browser is selected";
            }else if (browserName=="edge"){
                result= "edge browser is selected";
            }
        }else {
            result = "Invalid browser";
        }
        System.out.println(result);



    }
}
