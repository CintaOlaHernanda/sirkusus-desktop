package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // Alamat database lokal XAMPP (port default 3306)
    private static final String URL = "jdbc:mysql://localhost:3306/db_sikursus";
    private static final String USER = "root";
    private static final String PASS = ""; // XAMPP default password kosong

    private Database() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}