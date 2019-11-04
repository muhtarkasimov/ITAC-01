package Day21.CW21_1;

public class CW21_1 {

    public static void main(String[] args) {
//        Student student1 = new Student("Mukhtar Kasimov", 21, 5);
//        Student student2 = new Student("Aidin Sabyrov", 20, 4);
//        Student student3 = new Student("Askhat Serikov", 24, 3);
//
//        Student[] students = {student1, student2, student3};
//
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < students.length; i++) {
//            sum1 += students[i].getNote();
//        }
//        double avg1 = (double)sum1 / students.length;
//        System.out.println(avg1);
//
//        for (Student student : students) {
//            sum2 += student.getNote();
//        }
//        double avg2 = (double) sum2 / students.length;
//        System.out.println(avg2);


        Bread bread = new Bread(500, 20, "AkNan");
        bread.bake();
        bread.pack();
        System.out.println();

        Bread lepeshka = new Lepeshka(400,25,"AkNan",15);
        lepeshka.bake();
        System.out.println();

        Lavash lavash = new Lavash(200, 40, "AkNan", 20);
        lavash.bake();
        System.out.println( );

        Baget baget = new Baget(600,80,"AkNan",60,10);
        baget.cut();
        baget.bake();
        baget.pack();


    }
}
