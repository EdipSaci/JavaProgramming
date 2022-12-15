package day38_Inheritance.employee;

public class Employee {

    public String name,jobTitle,salaryName;
    public long id;
    public int age;
    public char gender;

    public static String companyName= "Cydeo";

    public Employee(String name, String jobTitle, String salaryName, long id, int age, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name+ " is working as a "+ jobTitle);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", company Name='" + companyName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
