package Day17.HW17_2;

import java.util.Date;

public class Course {

    private String courseName;
    private String creationDate;
    private int id;
    private String mentorFullName;

    public Course(){}

    public Course(String courseName, String creationDate, int id, String mentorFullName) {
        this.courseName = courseName;
        this.creationDate = creationDate;
        this.id = id;
        this.mentorFullName = mentorFullName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMentorFullName() {
        return mentorFullName;
    }

    public void setMentorFullName(String mentorFullName) {
        this.mentorFullName = mentorFullName;
    }
}
