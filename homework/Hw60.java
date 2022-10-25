/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw60;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s,s2="";
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一串小寫英文：");
        s=scanner.nextLine();
        for(int i=0;i<s.length();i++){
            n=s.charAt(i);
            if(n==97 || n==101 || n==105 || n==111 || n==117){
                s2+=".";
            }
            else{
                s2+=s.charAt(i);
            }
        }
        
        System.out.println(s2);
    }
    
}
