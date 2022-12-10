package day32_Constructor;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    /*
    Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or conatin itself
     */

    public Employee(String name){
        this.name=name;
    }

    public Employee(String name,char gender){
        this(name); // this is how we call constructor method
        //Employee(name); error
        this.gender=gender;
    }

    public Employee(String name,char gender,String jobTitle){
        //this.name=name;
        //this.gender=gender;
        this(name, gender);
        this.jobTitle=jobTitle;

    }

    public Employee(String name,char gender, String jobTitle, double salary){
        this(name,gender,jobTitle);
        this.salary=salary;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */

}
