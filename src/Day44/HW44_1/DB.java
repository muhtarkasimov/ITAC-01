package Day44.HW44_1;

import Day43.CW43_1.Model.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<Town> getAllTowns() {
        String SQL = "select * from town";
        ArrayList<Town> list = new ArrayList<>();

        try (Connection con = connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SQL)
        ) {
            while (rs.next()) {
                list.add(new Town(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("country"),
                        rs.getInt("mayor"),
                        rs.getLong("population")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
