package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("Yaşar");
        Student student2=new Student("Rana",'F');
        Student student3=new Student("Mert",'M',21);
        Student student4=new Student("Taha",'F',11,123);
        Student student5=new Student("Ali",'M',23,157,'A');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        Student [] students= {student1,student2,student3,student4,student5};
        System.out.println(Arrays.toString(students));

    }


}
