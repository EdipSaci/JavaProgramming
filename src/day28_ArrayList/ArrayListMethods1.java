package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
// add() method  adds the data after the last index the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // 0 autoboxing
        numbers.add(20); // 1
        numbers.add(30); // 2 new shift 3
        numbers.add(40);  // 3 new shift 4
        numbers.add(50);  // 4 new shift 5
        numbers.add(60);  // 5 new shift 6
//add (index,Data) inserts the data at given index
        numbers.add(2,25); //2
        System.out.println(numbers);//[10, 20, 25, 30, 40, 50, 60]

// size() method returns the total number of elements
        System.out.println(numbers.size()); //7
        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex); //6

//get(index) : returns the element at the given index
        int num=numbers.get(3);
        System.out.println("num = " + num); //30
        System.out.println("-------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("--------------------------------------");
// set(index, Data) :  replaces the element at given index with the new element
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        System.out.println(list); //[Java, Python, Java, C#, Ruby]

        list.set(2,"JavaScript");
        list.set(3,"C++");
        System.out.println(list); //[Java, Python, JavaScript, C++, Ruby]

        System.out.println("--------------------------------------");
// remove(int index) : removes the element at the given index
        ArrayList<String> employees = new ArrayList<>();
        employees.add("kemal");
        employees.add("orhan");
        employees.add("nazım");
        employees.add("Necip");
        employees.add("elif");
        employees.add("Ziya");
        employees.add("Stefan");

        System.out.println(employees); //[kemal, orhan, nazım, Necip, elif, Ziya, Stefan]
        employees.remove(0);
        System.out.println(employees);//[orhan, nazım, Necip, elif, Ziya, Stefan]
        employees.remove(employees.size()-1);//remove last element
        System.out.println(employees);  //[orhan, nazım, Necip, elif, Ziya]

// remove()Object : removes the given object
        employees.remove("elif");
        System.out.println(employees); //[orhan, nazım, Necip, Ziya]

        boolean r1 =employees.remove("nazım");
        System.out.println(r1);



    }
}
