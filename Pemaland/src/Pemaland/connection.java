/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;


import java.net.URL;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author muhst
 */
public class connection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/pemaland";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public connection() throws SQLException {
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }       
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
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

    public void query(String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public int executeUpdate(String sql) throws SQLException {
        int result = 0;
        try (Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
             Statement statement = connection.createStatement()) {
            result = statement.executeUpdate(sql);
        }
        return result;
    }
}