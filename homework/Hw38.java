/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw38;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("輸入數字：");
        a=scanner.nextInt();
        b=Math.round(a/2);
        for(int i=0;i<=b;i++){
            for(int k=1;k<=b-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
       for(int i=0;i<=b;i++){
           for(int k=1;k<=i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=b-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
       }
        	

		
        

		

        
        
        
    }
    
}
