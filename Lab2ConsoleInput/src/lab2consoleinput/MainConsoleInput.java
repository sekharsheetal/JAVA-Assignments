/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2consoleinput;
import java.util.Scanner;
import lab2consoleinput.ProductConsoleInput;
import lab2consoleinput.Supplier;


/**
 *
 * @author Sheetal Sekhar
 */
public class MainConsoleInput {
    
    public static void main (String[] args)
    {
        ProductConsoleInput p= new ProductConsoleInput();
        Supplier supplier = p.getSupplier();
      
         Scanner sc= new Scanner(System.in);
         
         
         System.out.println("Enter Name: ");
         String name =sc.nextLine();
         p.setName(name);
         System.out.println("Name is "+ p.getName());
         
         System.out.println("Enter Price: ");
         float price  =sc.nextFloat();
         p.setPrice(price);
        System.out.println("Price is "+ p.getPrice());
     
          System.out.println("Enter Description: ");
         String desc  =sc.next();
         p.setDescription(desc);
         System.out.println("Price is "+ p.getDescription());
    
         
         System.out.println("Enter Availibilty number:");
         int availNum  =sc.nextInt();
         p.setAvailNum(availNum);
         System.out.println("Availablity Number is "+ p.getAvailNum());
         
         System.out.println("Enter Supplier Name:");
         String supName  =sc.next();
         supplier.setSupplierName(supName);
         System.out.println("Supplier Name is "+ supplier.getSupplierName());
         
         System.out.println("Enter Supplier Id:");
         String supId  =sc.next();
         supplier.setSupplierId(supId);
         System.out.println("Supplier Id is "+ supplier.getSupplierId());
         
         System.out.println("Does user want to update if Yes press 1 if not press No for 2");
         int update = sc.nextInt();
        
         
         if 
                 (update==2)
         {
          
         
         System.out.println("Name is "+ p.getName());
          System.out.println("Price is "+ p.getPrice());
          System.out.println("Description is "+ p.getDescription());
          System.out.println("Availibity number "+ p.getAvailNum());
           System.out.println("Supplier Name is "+ supplier.getSupplierName());
           System.out.println("Supplier Id is "+ supplier.getSupplierId());
         
    }
        
         while (update==1)
                 {
   System.out.println("Enter Name: ");
         String name1 =sc.next();
         p.setName(name1);
         System.out.println("Name is "+ p.getName());
         
         System.out.println("Enter Price: ");
         float price1  =sc.nextFloat();
         p.setPrice(price1);
          System.out.println("Price is:"+p.getPrice());
          
          System.out.println("Enter Description: ");
         String desc1  =sc.next();
         p.setDescription(desc1);
    System.out.println("Description is:"+p.getDescription());
         
         System.out.println("Enter Availibilty number: ");
         int availNum1  =sc.nextInt();
         p.setAvailNum(availNum1);
          System.out.println("Availibilty number is: "+p.getAvailNum());
         
         System.out.println("Enter Supplier Name: ");
         String supName1  =sc.next();
         supplier.setSupplierName(supName1);
         System.out.println("Supplier Name is:"+ supplier.getSupplierName());
         
         System.out.println("Enter Supplier Id: ");
         String supId1  =sc.next();
         supplier.setSupplierId(supId1);
           System.out.println("Supplier Id is:"+supplier.getSupplierId());
             
           System.out.println("do you want to update again? if no 2 ");
           update = sc.nextInt();
           System.out.println("Name is "+ p.getName());
          System.out.println("Price is "+ p.getPrice());
          System.out.println("Description is "+ p.getDescription());
          System.out.println("Availibity number "+ p.getAvailNum());
           System.out.println("Supplier Name is "+ supplier.getSupplierName());
           System.out.println("Supplier Id is "+ supplier.getSupplierId());
           
}
      
    }

}