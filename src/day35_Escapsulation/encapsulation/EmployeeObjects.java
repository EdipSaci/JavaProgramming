package day35_Escapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 =new Employee("", 'q',-28,-110000);
        System.out.println(employee1);

        Employee employee2= new Employee("Tahir",'M',28,142000);
        System.out.println(employee2);

        employee2.setAge(32);
        System.out.println(employee2);
        employee2.setSalary(employee2.getSalary()+10000);
        System.out.println(employee2.getSalary());


    }
}
