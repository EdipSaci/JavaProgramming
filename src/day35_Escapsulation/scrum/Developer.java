package day35_Escapsulation.scrum;

public class Developer {
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            return;
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            System.out.println("Invalid salary: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }
}
