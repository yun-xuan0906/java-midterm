/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw32;

import java.util.Scanner;

/**
 *
 * @author cloud
 */
public class Hw32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("輸入正整數：");
        n=scanner.nextInt();
        
        if(n<11 &n>1000){
            System.out.println("輸入錯誤");
        }
        else{
            if(n%2==0 & n%11==0 & n%5!=0 & n%7!=0){
                System.out.println(n+"為新公倍數");
            }
            else{
                System.out.println(n+"不為新公倍數");
            }
        }
        
        
        
        
        
    }
    
}
