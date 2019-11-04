package Day17.HW17_2;

public class Class {

    String startDate;
    Student[] presentStudents;
    Course course;
    String startTime;
    boolean isHWGiven;
    boolean isBeenExam;

    public Class() {
    }

    public Class(String startDate, Course course, String startTime) {
        setStartDate(startDate);
        setCourse(course);
        setStartTime(startTime);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (startDate.equals("")) return;
        this.startDate = startDate;
    }

    public Student[] getPresentStudents() {
        return presentStudents;
    }

    public void setPresentStudents(Student[] presentStudents) {
        this.presentStudents = presentStudents;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        if (startTime.equals("")) return;
        this.startTime = startTime;
    }

    public boolean isHWGiven() {
        return isHWGiven;
    }

    public void setHWGiven(boolean HWGiven) {
        isHWGiven = HWGiven;
    }

    public boolean isBeenExam() {
        return isBeenExam;
    }

    public void setBeenExam(boolean beenExam) {
        isBeenExam = beenExam;
    }

    @Override
    public String toString() {
        String s = "Class's:" +
                "\n Course: \n" + course +
                "\nStart date: " + startDate +
                "\nStart time: " + startTime +
                "\nHomeWork is give: " + isHWGiven +
                "\nExam is been: " + isBeenExam +
                "\n  Students: \n";
        for (Student student : presentStudents) {
            s += student + "\n";
        }

        return s;
    }
}
