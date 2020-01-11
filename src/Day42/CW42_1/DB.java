package Day42.CW42_1;

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

    public void printAllStudents() {
        String SQL = "select * from students_1";
        try (Connection con = connect();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)
        ) {
            while (rs.next()) {
                Thread.sleep(300);
                System.out.print(rs.getInt("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getInt("group_id") + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printAllGroups() {
        String SQL = "select * from groups_1";
        try (Connection con = connect();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)
        ) {
            while (rs.next()) {
                Thread.sleep(300);
                System.out.print(rs.getInt("id") + " ");
                System.out.println(rs.getString("name") + " ");
//                System.out.println(rs.getInt("group_id") + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getTrainersCount() {
        String SQL = "SELECT count(*) FROM trainers";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
            //or if you know column name, you can name exactly
            //as rs.getInt("age");
        } catch (SQLException e) {
            e.getMessage();
        }
        return count;
    }

    public void insertPeople(int id, String name, Date bdate) {
        String SQL = "insert into person(id, fullname, birthdate) values (?,?,?)";

        try (Connection con = connect();
             PreparedStatement statement = con.prepareStatement(SQL)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setDate(3, bdate);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCountry(int id, String name, String code, long population, int president) {
        String SQL = "insert into country (id, name, code, population, president) values (?,?,?,?,?)";

        try (Connection con = connect();
             PreparedStatement st = con.prepareStatement(SQL)
        ) {
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, code);
            st.setLong(4, population);
            st.setInt(5, president);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addTown(int id, String name, int country, int mayor, long population) {
        String SQL = "insert into town (id, name, country, mayor, population) values (?,?,?,?,?)";

        try (Connection con = connect();
             PreparedStatement st = con.prepareStatement(SQL)
        ) {
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, country);
            st.setInt(4, mayor);
            st.setLong(5, population);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Country> getAllCountries() {
        String SQL = "select * from country";
        List<Country> list = new ArrayList<>();

        try (Connection con = connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SQL)
        ) {
            while (rs.next()) {
                list.add(new Country(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("code"),
                        rs.getLong("population"),
                        rs.getInt("president")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

//    public int
}
