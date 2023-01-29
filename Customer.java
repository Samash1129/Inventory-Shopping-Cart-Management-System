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
public class Customer
{
    private String Name;
    private long PhoneNumber;
    
    public Customer()
    {
        
    }
    
    public Customer(String Name, long PhoneNumber)
    {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }

    public void setName(String Name) 
    {
        this.Name = Name;
    }

    public void setPhoneNumber(long PhoneNumber) 
    {
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() 
    {
        return Name;
    }

    public long getPhoneNumber() 
    {
        return PhoneNumber;
    }
    
    @Override
    public String toString()
    {
        return getName() + "\t" + getPhoneNumber();
    }
}
