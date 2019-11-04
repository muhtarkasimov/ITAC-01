package Day21.HW21_1;

public class Student extends Person {

    String studentId;
    String birthDate;

    public Student() {}

    public Student(String birthDate, String studentId) {
        setBirthDate(birthDate);
        setStudentId(studentId);
    }

    public Student(String fullName, int age, String gender, String birthDate, String studentId) {
        super.setAge(age);
        super.setFullName(fullName);
        super.setGender(gender);
        setBirthDate(birthDate);
        setStudentId(studentId);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId.equals("")) return;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nMy birth date is " + birthDate +
                "\nMy student id is " + studentId;

        return s;
    }
}



