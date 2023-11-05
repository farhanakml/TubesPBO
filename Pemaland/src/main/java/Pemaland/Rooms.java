/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;

/**
 *
 * @author muham
 */
public class Rooms extends Guest{
    private int RoomAvailable;
    private String Location;
    
    public Rooms(String Name, int Id, int RoomNo, int RoomAvailable, String Location){
        super(Name, Id, 0, "", RoomNo);
//        Name = super.getName();
//        Id = super.getId();
//        RoomNo = super.getRoomNo();
        this.RoomAvailable = RoomAvailable;
        this.Location = Location;
        
    }

    public int getRoomAvailable() {
        return RoomAvailable;
    }

    public void setRoomAvailable(int RoomAvailable) {
        this.RoomAvailable = RoomAvailable;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void RoomRes(){
        // Test
    }
    
}
