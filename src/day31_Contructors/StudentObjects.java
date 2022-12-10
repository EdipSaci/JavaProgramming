package day31_Contructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1=new Student("Ahmet",21,'M','A',1245);
        Student student2=new Student("Rıza",41,'F','C',411);
        System.out.println(student1);//Student{name='Ahmet', age=21, gender=M, grade=A, ID=1245}
        System.out.println(student2);//Student{name='Rıza', age=41, gender=F, grade=C, ID=411}

    }
}
