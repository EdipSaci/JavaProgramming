package day33_Statics;

public class TaskPersonObjects {
    public static void main(String[] args) {
        Task3Person person= new Task3Person("Edip",32,'M');

        System.out.println(person.eat("burger"));
        System.out.println(person.drink("tea"));
        System.out.println(person.name);
    }
}
