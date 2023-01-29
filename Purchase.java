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
public class Purchase extends Inventory
{
    private int Quantity;
        
    public Purchase()
    {
        
    }
    
    public Purchase(String ItemName, int Quantity)
    {
        super(ItemName);
        this.Quantity = Quantity;
    }

    public void setQuantity(int Quantity) 
    {
        this.Quantity = Quantity;
    }

    public int getQuantity() 
    {
        return Quantity;
    }
    
    public String toString()
    {
        return super.getProductName() + "\t" + super.getUnitPrice() + "\t" + getQuantity() + "\n";
    }
}
