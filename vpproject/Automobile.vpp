/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

import java.util.Scanner;

/**
 * * This code is the basis for the SYST 17796 midterm exam. Do not edit this code. Use it to answer the questions in SLATE.
 * An Automobile has on/off, oil and type of wash owner wants.
 * @author srini
 */
public class Automobile {

    
    public boolean on;
    private int oil;
    private String wash;
    
    public static String [] wash_category={"Basic","Premium","Platinum"};
   
    public Automobile(boolean givenStatus,int givenOil, String givenCategory)
    {
        on=givenStatus;
        oil=givenOil;
        wash=givenCategory;
    }
  
    /** the automobile is going for washing service
     * */
    public void wash(String serv)
    {
        System.out.println("The vehicle is getting "+ serv +" wash! Thank you!");
    }
     
    /** the method for calculating charges for filling the oil
     * */
    public double ChargesForOil(int givenOil)
    {
        double amount1=0.0;
        switch(givenOil)
        {
            case 0: amount1=0.0;
                    break;
            case 1: amount1=2.0;
                    break;
            case 2: amount1=4.0;
                    break;
            case 3: amount1=6.0;
                    break;
            case 4: amount1=8.0;
                    break;
            case 5: amount1=10.0;
                    break;   
            default:
                System.out.println("Not a Valid range 1-5");
        }
        return amount1;
    }
    
    /** the method for calculating charges for washing the Automobile
     * */
    public double chargesForWash(String washCategory)
    {
        double amount2=0.0;
        if(washCategory.equalsIgnoreCase("Basic"))
            amount2=8.0;
        if(washCategory.equalsIgnoreCase("Premium"))
            amount2=11.0;
        if(washCategory.equalsIgnoreCase("Platinum"))
            amount2=15.0;
        
        return amount2;
    }
    
     /** the method for calculating the final bill for the Automobile service
      * It also adds 13% Tax
     * */
    
    public double calculateBill(int givenOil,String washCategory)
    {
        double amount=ChargesForOil(givenOil)+chargesForWash(washCategory);
        
        double final_amt=amount + (0.13*amount);
        
        return final_amt;
    }
    
    
}
