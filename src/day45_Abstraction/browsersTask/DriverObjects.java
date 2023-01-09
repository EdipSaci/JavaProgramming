package day45_Abstraction.browsersTask;

public class DriverObjects {

    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.close();
        chromeDriver.executeScript("java");
        chromeDriver.findElements("//button[@id='asd']");
        chromeDriver.quit();
        chromeDriver.getTitle();
    }
}
