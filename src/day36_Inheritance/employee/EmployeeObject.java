package day36_Inheritance.employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Tester tester= new Tester();
        tester.setInfo("Edip",'M',25,123,"SDET",10000);
        tester.testing();

        Developer developer= new Developer();
        developer.setInfo("Yusuf",'M',26,122,"Developer",11000);
        developer.coding();
        Teacher teacher=new Teacher();
        teacher.setInfo("Muhtar",'M',30,111,"ADAM",11200);
        teacher.teaching();
        Driver driver = new Driver();
        driver.setInfo("Kamil",'M',31,114,"Driver",9000);
        driver.driving();

    }

}
