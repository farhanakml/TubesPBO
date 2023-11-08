/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;

/**
 *
 * @author muham
 */
public class Guest {
    private String Name;
    private int Id;
    private int PhoneNo;
    private String Address;
  

    public Guest(String Name, int Id, int PhoneNo, String Address) {
        this.Name = Name;
        this.Id = Id;
        this.PhoneNo = PhoneNo;
        this.Address = Address;
       
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }


    public void CheckIn(){
        // Test
    }
    
    public void CheckOout(){
        // Test
    }
    
    public void PayBill(){
        // Test
    }
    
    public void OrderFood(){
        // Test
    }
    
    public void SubmitFeedback(){
        // Test
    }
}
