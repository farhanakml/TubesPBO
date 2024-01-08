package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    public void insertDataRoom(String Fullname, String Phone, String RoomType, String CheckIn, String CheckOut, int Harga){
        try {
            String sql = "INSERT INTO food_order (Fullname, Phone, RoomType, CheckIn, CheckOut, Harga) VALUES (?, ?, ? ,? ,? ,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,Fullname);
            preparedStatement.setString(2,Phone);
            preparedStatement.setString(3,RoomType);
            preparedStatement.setString(4,CheckIn);
            preparedStatement.setString(5,CheckOut);
            preparedStatement.setInt(6,Harga);
            
          
            preparedStatement.executeUpdate();
            System.out.println("Data berhasil dimasukkan ke dalam tabel.");
        } catch (Exception e) {
            System.out.println("Terdapat kesalahan saat proses pemasukkan data ke dalam tabel.");
        }
    }
    
    public void insertDataFood(String Fullname, String Appetizer, String Foods, String Drinks, String Dessert, int Harga){
        try {
            String sql = "INSERT INTO mahasiswa (Fullname, Appetizer, Foods, Drinks, Dessert, Harga) VALUES (?, ?, ? ,?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,Fullname);
            preparedStatement.setString(2,Appetizer);
            preparedStatement.setString(3,Foods);
            preparedStatement.setString(4,Drinks);
            preparedStatement.setString(5,Dessert);
            preparedStatement.setInt(6,Harga);            
            preparedStatement.executeUpdate();
            System.out.println("Data berhasil dimasukkan ke dalam tabel.");
        } catch (Exception e) {
            System.out.println("Terdapat kesalahan saat proses pemasukkan data ke dalam tabel.");
        }
    }
}