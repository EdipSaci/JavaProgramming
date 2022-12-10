package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setInfo("Jackie",1257,'M',"Kung Fu",12500,true);

        Employee employee1=new Employee();
        employee1.setInfo("Tolstoy",5871,'M',"Author",45711,true);

        Employee employee2= new Employee();
        employee2.setInfo("Casanova",4520,'F',"nothing",10000,false);

        Employee employee3= new Employee();
        employee3.setInfo("Anna",4520,'F',"Dancer",25550,true);

        Employee employee4= new Employee();
        employee4.setInfo("Stendal",4520,'M',"Vendor",785000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee};
        int countFullTime=0;
        int countPartTime=0;

        for (Employee each : employees) {
            if (each.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
        }
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);

        double maxSalary=employees[0].salary;
        for (Employee each : employees) {
            if (each.salary>maxSalary){
                maxSalary=each.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);




    }
}
