package Day43.CW43_1;

import Day42.CW42_1.DB;

import java.sql.Date;

public class CW43_1 {

    public static void main(String[] args) throws Exception {
        DB db = new DB();

        db.printAllStudents();
        System.out.println();
        db.printAllGroups();

//        db.insertPeople(11, "Aidin Sabyrov", new Date("1/3/1999"));
//        db.addCountry(3, "Ukraine", "UA", 42000000, 4);
        db.addTown(4, "Kiev", 3, 4, 2800000);

    }
}
