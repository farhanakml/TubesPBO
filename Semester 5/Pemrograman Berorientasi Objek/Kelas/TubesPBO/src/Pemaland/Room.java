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
public class Room extends Guest{
    private int RoomNo;
    private int Price;
    private Date CheckIn;
    private Date CheckOut;
    private int OccupancyLimit;
    private String Description;
    private boolean booked;
    
    
    
    public Room(int RoomNo, int Price,Date CheckIn,Date CheckOut,int OccupancyLimit, String Description, String Name, int Id, int PhoneNo, String Address   ){
        super("", 0, 0, "");
//        Name = super.getName();
//        Id = super.getId();
//  
        this.RoomNo = RoomNo;
        this.Price = Price;
        this.CheckIn = CheckIn;
        this.CheckOut= CheckOut;
        this.OccupancyLimit= OccupancyLimit;
        this.Description = Description;
        this.booked = false;
   
    }
    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public Date getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(Date CheckIn) {
        this.CheckIn = CheckIn;
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Date CheckOut) {
        this.CheckOut = CheckOut;
    }

    public int getOccupancyLimit() {
        return OccupancyLimit;
    }

    public void setOccupancyLimit(int OccupancyLimit) {
        this.OccupancyLimit = OccupancyLimit;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    public void BookRoom(int RoomNo, int Price,Date CheckIn,Date CheckOut,int OccupancyLimit, String Description ){
       
            
        
        
    }
  


    
}
