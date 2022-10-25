/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw48;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入英文句子：");
        s = scanner.nextLine();
        
        String a[]=s.split(" ");
        String b[]=new String [a.length];
        int j=0;
        for(int i=a.length-1;i>-1;i--){
            
            b[j]=a[i];
            j++;
        }
        
        
        System.out.println(Arrays.toString(b));
        
        
    }
    
}
