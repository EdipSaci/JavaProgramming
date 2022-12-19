package day39_Recap.student;

public class Student extends Person{

    private long studentId;
    private String fieldOfStudy,schoolName;
    private char grade;

    public Student(String name, int age, char gender, long studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }


    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy==null || fieldOfStudy.isEmpty()){
            System.err.println("Invalid field Of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName==null || schoolName.isEmpty()){
            System.err.println("Invalid school name");
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if ( ! (grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')){
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
