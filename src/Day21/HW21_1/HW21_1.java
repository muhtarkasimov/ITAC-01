package Day21.HW21_1;

public class HW21_1 {

    public static void main(String[] args) {
        Student student = new Student("01.01.2000", "Gates", "Bill", "Male", 63);
        Student student1 = new Student("01.01.2000", "Jobs", "Steve", "Male", 68);
        Student student2 = new Student("01.01.2000", "Wozniak", "Steve", "Male", 70);

        //getter & setter
        student.setBirthDate("28.10.1955");
        student1.setBirthDate("24.02.1955");
        student2.setBirthDate("11.08.1950");

        Course course1 = new Course("Java-1901", "01.10.2019", 1, "Askhat Serikov");
        Student[] students = {student, student1, student2};
        Group group1 = new Group(students, course1, "02.10.2019", 10);
        Class class1 = new Class("03.10.2019", course1, "19:00");

        //after class starter getting present students and giving HW
        Student[] presentStudents = {student, student2};
        class1.setPresentStudents(presentStudents);
        class1.setHWGiven(true);

        System.out.println(class1);
    }
}
