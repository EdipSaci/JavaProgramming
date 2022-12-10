package day33_Statics;

public class Task1CydeoStudent {

    public String name;
    public char gender ,grade;
    public int age,ID,batchNumber,groupNumber;

    public static String schoolName = "Cydeo";
    public static String  programmingLanguage= "Java";

    public Task1CydeoStudent(String name, char gender, char grade, int age, int ID, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+ " is studying");
    }
    public void attendClass(){
        System.out.println(name+ "attended class");
    }
    public void printSchoolName(){
        System.out.println(schoolName);
    }
    public void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "Task1CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
