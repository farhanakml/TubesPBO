/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;

/**
 *
 * @author muham
 */
public class Manager {
    private String Name;
    private int Id;
    private int PhoneNo;
    private String Location;

    public Manager(String Name, int Id, int PhoneNo, String Location) {
        this.Name = Name;
        this.Id = Id;
        this.PhoneNo = PhoneNo;
        this.Location = Location;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    public void PurchaseInventory(){
        // Test
    }
    
    public void RecordComplaints(){
        // Test
    }
    
    public void ManageStaff(){
        // Test
    }
}
