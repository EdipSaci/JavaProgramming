package day39_Recap.student;

public class StudentObjects {
    public static void main(String[] args) {

        Student student= new Student("Namık",25,'M',123,"Math","Kemal",'B');
        CydeoStudent cydeoStudent = new CydeoStudent("Edip SAÇİ",32,'M',124,"SDET","Cydeo",'B',4646,6,"Java");
        GraduateStudent graduateStudent= new GraduateStudent("Adam",34,'M',147,"QA","Cydeo",'A',2018,4.5);

        System.out.println(student);
        System.out.println(cydeoStudent);
        System.out.println(graduateStudent);

        student.study();
        student.eat();
        student.drink();
        student.sleep();
        System.out.println("-------------------------------------");

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();
        cydeoStudent.study();
        System.out.println("---------------------------------------");

        graduateStudent.eat();
        graduateStudent.drink();
        graduateStudent.sleep();
        graduateStudent.study();
        graduateStudent.graduate();
        System.out.println("---------------------------------------");


    }
}
