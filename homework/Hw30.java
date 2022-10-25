/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw30;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m,n,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("小明身上有幾元：");
        m = scanner.nextInt();
        System.out.print("販賣機有幾種飲料：");
        n = scanner.nextInt();
        int drink[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("");
            drink[i] = scanner.nextInt();
        }
        for(int i:drink){
            if(m>=i){
                sum++;
            }
        }
        System.out.println(sum);
    }
    
}
