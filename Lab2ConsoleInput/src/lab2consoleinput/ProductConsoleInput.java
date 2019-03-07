/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2consoleinput;
import java.util.Scanner;
import lab2consoleinput.Supplier;

/**
 *
 * @author Sheetal Sekhar
 */
public class ProductConsoleInput {
    
    private String name;
    private float price;
    private int availNum;
    private String description;
private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

public ProductConsoleInput()
{
    this.supplier= new Supplier();
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
   
    
    
}
