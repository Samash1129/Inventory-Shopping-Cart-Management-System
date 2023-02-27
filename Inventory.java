/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping_cart;

/**
 *
 * @author a
 */
public class Inventory 
{
    private String ProductName;
    private double UnitPrice;
    private int Quantity;
    
    public Inventory()
    {
        
    }
    
    public Inventory(String ItemName)
    {
        this.ProductName = ItemName;
    }
    
    public Inventory(String ProductName, double UnitPrice, int Quantity)
    {
        this.ProductName = ProductName;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
    }

    public void setUnitPrice(double UnitPrice) 
    {
        this.UnitPrice = UnitPrice;
    }
    
    public double getUnitPrice() 
    {
        return UnitPrice;
    }

    public void setProductName(String ProductName) 
    {
        this.ProductName = ProductName;
    }
    
    public String getProductName() 
    {
        return ProductName;
    }

    public void setQuantity(int Quantity) 
    {
        this.Quantity = Quantity;
    }

    public int getQuantity() 
    {
        return Quantity;
    }

    @Override
    public String toString() 
    {
        return getProductName() + "\t" + getUnitPrice() + "\t" + getQuantity();
    }
}
