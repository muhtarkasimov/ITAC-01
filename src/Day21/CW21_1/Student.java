package Day21.CW21_1;

 public class Student {

    String fullName;
    int age;
    int note;

    protected Student(String fullName, int age, int note) {
        this.fullName = fullName;
        this.age = age;
        this.note = note;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
