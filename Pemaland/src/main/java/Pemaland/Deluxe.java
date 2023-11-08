/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;

import java.util.Date;

/**
 *
 * @author Putri Ayu
 */
public class Deluxe extends Rooms{
    private int RoomSize;
    private String[] Facilities;
    public Deluxe (int RoomSize,String[] Facilities, int RoomNo, int Price,Date CheckIn,Date CheckOut,int OccupancyLimit, String Description, String Name, int Id, int PhoneNo, String Address ){
        super( RoomNo, Price,CheckIn,CheckOut,OccupancyLimit,Description,Name, Id, PhoneNo, Address);
        this.RoomSize = RoomSize;
        this.Facilities = Facilities;
        
    }
    public int getRoomSize() {
        return RoomSize;
    }

    public void setRoomSize(int RoomSize) {
        this.RoomSize = RoomSize;
    }

    public String[] getFacilities() {
        return Facilities;
    }

    public void setFacilities(String[] Facilities) {
        this.Facilities = Facilities;
    }
    public void CheckAvailability(){
        
    }
    public void getRoomDescription(String Description){
        
    }
    void CalculatePrice(int Price, Date CheckIn, Date CheckOut){
        
    }
}
