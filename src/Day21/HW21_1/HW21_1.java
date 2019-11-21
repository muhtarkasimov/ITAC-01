package Day21.HW21_1;

public class HW21_1 {

    public static void main(String[] args) {

        Person student1 = new Student("Mukhtar Kasimov", 21, "male", "01.11.1998", "'JV-1901-01'");
        Person student2 = new Student("Aidin Sabyrov", 20, "male", "11.11.1998", "'JV-1901-02'");

        Person teacher1 = new Teacher("Askhat Serikov", 24, "male", "'JV-1901-99'");

        System.out.println(student1);
        System.out.println();

        System.out.println(student2);
        System.out.println();

        System.out.println(teacher1);
        System.out.println();



    }
}
