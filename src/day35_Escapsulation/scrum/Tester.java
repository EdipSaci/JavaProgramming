package day35_Escapsulation.scrum;

public class Tester {
    private String name,  jobTitle;
    private int employeeID;
    private double salary;

    public Tester(String name, String jobTitle, int employeeID, double salary) {
       setName(name);
       setJobTitle(jobTitle);
       setEmployeeID(employeeID);
       setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            System.err.println("Invalid ID");
            return;
        }
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
}
