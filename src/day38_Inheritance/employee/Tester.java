package day38_Inheritance.employee;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, String salaryName, long id, int age, char gender) {
        super(name, jobTitle, salaryName, id, age, gender);
    }

    @Override
    public void work() {
        System.out.println(name+ " is responsible for testing app as a "+ jobTitle);
    }
}
