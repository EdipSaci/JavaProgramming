package replit;

public class aaaaaa {

    //ATTRİBUTES
    public String name ;
    public int age;
    public String size;

    public static boolean hasHead;

    public aaaaaa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public aaaaaa(String name, int age, String size){
        this(name,age);
        this.size=size;

    }

    static {
        hasHead=true;
    }

    public static void hasHad(){
        System.out.println("our dog have head"+    hasHead);
    }

    public void eat(String food){
        System.out.println(name+"has own head"+ hasHead+ " is eating "+ food);
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
