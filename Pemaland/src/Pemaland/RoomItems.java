/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;
import java.util.Date;

/**
 *
 * @author muham
 */
public class RoomItems extends Guest{
    private String Phone;
    private String RoomType;
    private String CheckIn;
    private String CheckOut;
    private int Harga;
    private int Price;
    
    
    
    public RoomItems(String Fullname, String Phone, String RoomType, String CheckIn, String CheckOut, int Harga  ){
       
        super(Fullname);
        this.Phone = Phone;
        this.RoomType = RoomType;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        this.Harga = Harga;
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }

    public String getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(String CheckOut) {
        this.CheckOut = CheckOut;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
  
   
  


    
}
