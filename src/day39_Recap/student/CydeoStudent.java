package day39_Recap.student;

public class CydeoStudent extends Student{

    private int batchNumber,groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<0){
            System.err.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<0){
            System.err.println("Invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage==null || programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public CydeoStudent(String name, int age, char gender, long studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating more because of their language "+ getProgrammingLanguage());
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking more because of their language "+ getProgrammingLanguage());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping more because of their language "+ getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
