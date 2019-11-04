package Day21.HW21_1;

public class Group {

    private Student[] group;
    private Course course;
    private String startDate;
    private int duration;

    public Group(){}

    public Group(Student[] group, Course course, String startDate, int duration) {
        setGroup(group);
        setCourse(course);
        setStartDate(startDate);
        setDuration(duration);
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
        if (startDate.equals("")) return;
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) return;
        this.duration = duration;
    }

    @Override
    public String toString() {
        System.out.println(course);
        String s = "Start Date: " + startDate +
                "\nDuration: " + duration +
        "\nGroup: \n";
        for (Student student : group) {
            System.out.println(student);
        }
        return s;
    }
}
