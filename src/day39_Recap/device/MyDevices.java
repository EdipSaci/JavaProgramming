package day39_Recap.device;

public class MyDevices {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("6",100);
        PersonalComputer personalComputer= new PersonalComputer("Acer","12",140);
        Laptop laptop= new Laptop("lenovo","get",100);
        TV tv= new TV("LG","74GD",147);

        iphone.faceTime(1221546);
        laptop.code();
        tv.channelDown();
        tv.channelUp();
        personalComputer.code();

    }
}
