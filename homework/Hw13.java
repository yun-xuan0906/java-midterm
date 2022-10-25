/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw13;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1,s2="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入字元為：");
        s1 = scanner.nextLine();
        for(int i=s1.length()-1;i>-1;i--){
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2)==true){
            System.out.println("是迴文");
        }
        else{
            System.out.println("不是迴文");
        }
        
    }
    
}
