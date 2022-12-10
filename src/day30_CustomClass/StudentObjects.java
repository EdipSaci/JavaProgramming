package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');

        Student student2 = new Student();
        student2.setInfo("Kemal",'F',25,4578,'B');

        Student student3 = new Student();
        student3.setInfo("Orhan",'F',26,7578,'A');

        Student student4 = new Student();
        student4.setInfo("Namık",'M',26,4118,'B');

        Student student5 = new Student();
        student5.setInfo("Stefan",'M',26,5781,'C');

        Student[] students = {student1,student2,student3,student4,student5};
        for (Student each : students) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------------");
        ArrayList<Student> earlyBirds = new ArrayList<>(Arrays.asList(students)); //grade :A
        ArrayList<Student> angryBirds = new ArrayList<>();

        earlyBirds.removeIf(p-> p.grade!= 'A');
        System.out.println(earlyBirds);

        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);







    }
}
