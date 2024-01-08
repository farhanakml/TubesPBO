/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemaland;

/**
 *
 * @author muham
 */
// Extends Guest
public class FoodItems extends Guest {
    // Atribut Private Foods
    private String Appetizer;
    private String Foods;
    private String Drinks;
    private String Dessert;
    private int Harga;
    
    public FoodItems(String Fullname, String Appetizer, String Foods, String Drinks, String Dessert, int Harga  ){
      
        // Inisialisasi variabel Superclass
        super(Fullname);
        // Inisialisasi variabel
        this.Appetizer = Appetizer;
        this.Foods = Foods;
        this.Drinks = Drinks;
        this.Dessert = Dessert;
        this.Harga = Harga;
    }

    // Getter dan Setter
    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }
 

    public String getAppetizer() {
        return Appetizer;
    }

    public void setAppetizer(String Appetizer) {
        this.Appetizer = Appetizer;
    }

    public String getFoods() {
        return Foods;
    }

    public void setFoods(String Foods) {
        this.Foods = Foods;
    }

    public String getDrinks() {
        return Drinks;
    }

    public void setDrinks(String Drinks) {
        this.Drinks = Drinks;
    }

    public String getDessert() {
        return Dessert;
    }

    public void setDessert(String Dessert) {
        this.Dessert = Dessert;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
}
