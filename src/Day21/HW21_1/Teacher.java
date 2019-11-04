package Day21.HW21_1;

public class Teacher extends Person {

    String teacherId;

    public Teacher() {}

    public Teacher(String teacherId) {
        setTeacherId(teacherId);
    }

    public Teacher(String fullName, int age, String gender, String teacherId) {
        super.setAge(age);
        super.setFullName(fullName);
        super.setGender(gender);
        setTeacherId(teacherId);
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        if (teacherId.equals("")) return;
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nMy teacher id is " + teacherId;

        return s;
    }
}
