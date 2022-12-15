package day38_Inheritance.employee;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, String jobTitle, String salaryName, long id, int age, char gender) {
        super(name, jobTitle, salaryName, id, age, gender);
    }

    @Override
    public void work() {
        System.out.println(name+ " is a Business Analyst and working today");
    }
}
