package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/katasql";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static Connection getConnection() {

        Connection connection = null;
        {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                Class.forName(DRIVER);
                System.out.println("We are connected!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Connection ERROR!");
            }
        }
        return connection;
    }
}
