package day38_Inheritance.employee;

public class ProductOwner extends Employee{
    public ProductOwner(String name, String jobTitle, String salaryName, long id, int age, char gender) {
        super(name, jobTitle, salaryName, id, age, gender);
    }

    @Override
    public void work() {
        System.out.println(name+ " is a product owner and working today");
    }
}
