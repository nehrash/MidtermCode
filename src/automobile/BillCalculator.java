/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

import static automobile.Automobile.wash_category;
import java.util.Scanner;

/**
 *
 * @author srini
 */
public class BillCalculator {
    
     /**
     * A method to simulate the automobile and 
     * ask the user to select the type of washing service he wants and
     * Amount of oil to be filled
     * and get the service done.
     */
    public static void main(String[] args) {
        
       Automobile a =new Automobile(true,0,"");
       
       System.out.println("The vehicle is Started..");
       
       System.out.println("How much Oil to fill? Max. 5");
       
       Scanner sc=new Scanner(System.in);
       int givenOil=sc.nextInt();
       
       System.out.println("Please choose the Type of Wash you want.");
       for(int i=0; i<wash_category.length; i++)
        {
            System.out.println(wash_category[i]);
        }
       sc.nextLine();
        
       String givenWash=sc.nextLine();
       a.wash(givenWash);
        
       //calling the method to calculate the final bill
        System.out.println("Please Pay: $" + a.calculateBill(givenOil, givenWash));
    }
}
