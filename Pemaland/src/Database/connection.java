package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connection {
    // Variabel untuk menyimpan objek koneksi
    private Connection conn;

    // Konstruktor
    public connection() {
        try {
            // Memuat driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Membuat koneksi ke database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pemaland?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        }
    }

    // Metode untuk mengambil koneksi
    public Connection getConnection() {
        return conn;
    }
}