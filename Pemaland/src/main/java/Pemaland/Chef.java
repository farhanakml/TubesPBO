package Pemaland;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class Chef extends Guest{
    private String Location;
    
    public Chef(String Name, int Id, String Location){
        super(Name, Id, 0, "", 0);
        this.Location = Location;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
}
