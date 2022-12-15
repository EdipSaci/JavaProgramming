package day38_Inheritance.employee;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, String salaryName, long id, int age, char gender) {
        super(name, jobTitle, salaryName, id, age, gender);
    }

    @Override
    public void work() {
        System.out.println(name+ " is developing app as a "+ jobTitle);
    }

}
