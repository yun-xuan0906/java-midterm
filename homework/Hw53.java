/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw53;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double km,money;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入路程公里數(km)：");
        km = scanner.nextDouble();
        
        if(km<1.5){
            System.out.println("所需車資為：75");
        }
        else{
            money=Math.ceil((km-1.5)/0.25)*5+75;
            System.out.println("所需車資為："+money);
        }
         
        
        
        
        
        
        
        
    }
    
}
