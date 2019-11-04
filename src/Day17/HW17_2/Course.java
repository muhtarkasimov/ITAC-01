package Day17.HW17_2;

import java.util.Date;

public class Course {

    private String courseName;
    private String creationDate;
    private int id;
    private String mentorFullName;

    public Course(){}

    public Course(String courseName, String creationDate, int id, String mentorFullName) {
        setCourseName(courseName);
        setCreationDate(creationDate);
        setId(id);
        setMentorFullName(mentorFullName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName.equals("")) return;
        this.courseName = courseName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        if (creationDate.equals("")) return;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) return;
        this.id = id;
    }

    public String getMentorFullName() {
        return mentorFullName;
    }

    public void setMentorFullName(String mentorFullName) {
        if (mentorFullName.equals("")) return;
        this.mentorFullName = mentorFullName;
    }

    @Override
    public String toString() {
        String s = "Course name: " + courseName +
                "\nCreationDate: " + creationDate +
                "\nCourse id: " + id +
                "\nMentor's Name: " + mentorFullName + "\n";
        return s;
    }
}
