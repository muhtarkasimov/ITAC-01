package Day42.CW42_1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {

        DB db = new DB();
        Connection connection = db.connect();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        if (connection != null) connection.close();



    }



}
