package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {
        Iphone iphone= new Iphone("13 Pro","5.6 inches",1000,"Gray");
        Samsung samsung= new Samsung("Galaxy S19","4.5 inches",500,"White");
        Nokia nokia=new Nokia("7889","2.9 inches",200,"Black");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(1212);
        iphone.faceTime(122377);
        iphone.faceTime("wwwwæ@gmail.com");
        System.out.println("------------------------------------");

        samsung.call(545);
        samsung.text(548789);
        samsung.freeze();
        System.out.println("-------------------------------------------");

        nokia.call(555545);
        nokia.text(89654);
        nokia.selfDefense();
        System.out.println("---------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }




}
