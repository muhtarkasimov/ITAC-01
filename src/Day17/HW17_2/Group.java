package Day17.HW17_2;

import java.util.Date;

public class Group {

    private Student[] group;
    private Course course;
    private String startDate;
    private int duration;

    public Group(){}

    public Group(Student[] group, Course course, String startDate, int duration) {
        this.group = group;
        this.course = course;
        this.startDate = startDate;
        this.duration = duration;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) return;
        this.duration = duration;
    }
}
