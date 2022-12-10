package day36_Inheritance.phone;

public class PhoneStore {
    public static void main(String[] args) {

        Iphone iphone= new Iphone();
        iphone.setInfo("iphone 12", "5.6 inches","Gray",1000);
        iphone.faceTime("res");
        iphone.faceTime(22131313);


        Samsung samsung= new Samsung();
        samsung.setInfo("galaxy S19","6 inches","Black",900);
        samsung.call(1313131);
        samsung.freeze();

        Nokia nokia = new Nokia();
        nokia.setInfo("Brik","4 inches","Pink",60);
        nokia.selfDefense();



    }
}
