package Day42.CW42_1;

import java.sql.*;

public class DB {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public int getTrainersCount() {
        String SQL = "SELECT count(*) FROM trainers";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException e) {
            e.getMessage();
        }
        return count;
    }

//    public int
}