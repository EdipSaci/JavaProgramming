package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester =new Tester("Edip",32,'M',123,"Sdet",120000);
        Developer developer = new Developer("Taha",33,'M',114,"Java Developer",130000);
        Teacher teacher=new Teacher("Muhtar",33,'M',14,"Java Teacher",135000);
        Student student=new Student("Yusuf",21,'M',11,"Java");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("-----------------------------------------------");
        developer.setAge(21);
        System.out.println(developer);

        System.out.println("-----------------------------------------------");

        developer.work();
        teacher.work();
        tester.work();
        //student.work()
        System.out.println("-----------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("--------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        //tester.fixingBugs()
        tester.createTicket();
        System.out.println("--------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        //teacher.fixingBugs()
        //teacher.createTicket()
        System.out.println("--------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();
        //student.createTicket()
        //student.fixingBugs()
        student.study();

    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */