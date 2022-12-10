package day32_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Taha");
        Employee employee2= new Employee("Yeliz",'F');
        Employee employee3= new Employee("Ali",'M',"SDET");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }


}
