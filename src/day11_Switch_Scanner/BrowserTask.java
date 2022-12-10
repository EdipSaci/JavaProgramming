package day11_Switch_Scanner;

public class BrowserTask {
    public static void main(String[] args) {

        String browserName = "chrome",
                result = "";

        switch (browserName){
            case "chrome":
                result = "you selected chrome";
                break;
            case "firefox" :
                result = "you selected firefox";
                break;
            case "opera":
                result = "you selected opera";
                break;
            case "safari":
                result ="you selected safari";
                break;
            case "edge":
                result= "you selected edge";
                break;
            default:
                result =browserName + "is not valid";

        }

        System.out.println(result);
















    }
}
