/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入四位數字：");
        num = scanner.nextLine();
        
        int a=Character.getNumericValue(num.charAt(0));
        int b=Character.getNumericValue(num.charAt(1));
        int c=Character.getNumericValue(num.charAt(2));
        int d=Character.getNumericValue(num.charAt(3));
        a=(a+7)%10;
        b=(b+7)%10;
        c=(c+7)%10;
        d=(d+7)%10;
        System.out.println(c+""+d+""+a+""+b);

        
        
        
        
        
        
    }
    
}
