package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUntil {

    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String user = "sa";
            String pass = "";
            String url = "jdbc:sqlserver://localhost:1434;DatabaseName=QLSDV";

            c = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }

    public static void closeConnection(Connection c) {

        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
