package day39_Recap.student;

public class GraduateStudent extends Student{

    private int graduateYear ;
    private double graduatePoint;

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        if (graduateYear<2010){
            System.err.println("Invalid year");
            System.exit(1);
        }
        this.graduateYear = graduateYear;
    }

    public double getGraduatePoint() {
        return graduatePoint;
    }

    public void setGraduatePoint(double graduatePoint) {
        if (graduatePoint<2.5 || graduatePoint>5.0){
            System.out.println("Invalid graduate point");
            System.exit(1);
        }
        this.graduatePoint = graduatePoint;
    }

    public GraduateStudent(String name, int age, char gender, long studentId, String fieldOfStudy, String schoolName, char grade, int graduateYear, double graduatePoint) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setGraduateYear(graduateYear);
        setGraduatePoint(graduatePoint);
    }

    @Override
    public void study() {
        System.out.println(getName()+ " is studying more");
    }
    public void graduate(){
        System.out.println(getName()+ " is graduate at " + getGraduateYear()+ " with " + getGraduatePoint() + " points");
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                ", graduateYear=" + graduateYear +
                ", graduatePoint=" + graduatePoint +
                '}';
    }
}
