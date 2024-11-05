package University;

public class Course {


    public String courseName;
    public String instructor;
    public Integer enrolledStudent;


    public Course(String courseName,String instructor, Integer enrolledStudent) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudent = enrolledStudent;
    }
    public String getInstructor() {
        return instructor;
    }

    public String getCourseName() {
        return courseName;
    }
    public Integer getEnrolledStudent() {
        return enrolledStudent;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudent(Integer enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }

    @Override
    public String toString() {
        return
                "Course Name: " + courseName + '\n' +
                " Instructor: " + instructor + '\n' +
                " EnrolledStudent: " + enrolledStudent
                ;
    }
}
