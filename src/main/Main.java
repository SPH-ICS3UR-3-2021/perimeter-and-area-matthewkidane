/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println ("Option 1 = Permimeter of rectangle");
        System.out.println ("Option 2 = Area of rectangle");
        System.out.println ("Option 3 = Perimeter of Circle");
        System.out.println ("Option 4 = Area of Circle");
        System.out.println ("Option 5 = Terminate");
        
        boolean menu; 
        double option = in.nextDouble();
        if (option == 1) {
            System.out.println("What is the length?");
            double length = in.nextDouble();
            System.out.println("What is the width?");
            double width = in.nextDouble();
            System.out.println("the perimeter is" + width*2+length*2);
        } else if (option == 2) {
            System.out.println("What is the length?");
            double length = in.nextDouble();
            System.out.println("What is the width mate?");
            double width = in.nextDouble();
            System.out.println("The area is" + width*length);
        } else if (option == 3) {
            System.out.println("What is the radius?");
            double radius = in.nextDouble();
            System.out.println("What is pi?");
            double pi = in.nextDouble();
            System.out.println("the permieter of the circle is" + radius*2*pi);
        } else if (option == 4) {
            System.out.println ("What is the radius?");
            double radius = in.nextDouble();
            System.out.println("what is the pi?");
            double pi = in.nextDouble();
            System.out.println("The area of the circle is" +  pi*radius*radius);
        } while (option !=5);
        in.close();
    }
}
               
        
    

        
            
            
        
    
         
    

    
