/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入五張牌：");
        s = scanner.nextLine();
        String a[]=s.split(" ");
        for(int i=0;i<5;i++){
            if(a[i].equals("J") == true){
                a[i]="11";
            }
            if(a[i].equals("Q") == true){
                a[i]="12";
            }
            if(a[i].equals("K") == true){
                a[i]="13";
            }
            if(a[i].equals("A") == true){
                a[i]="1";
            }
        }
        int ans[]=new int [5];
        int sum=0;
        for(int i=0;i<5;i++){
            ans[i]=Integer.parseInt(a[i]);
            sum+=ans[i];
        }
        System.out.println(sum);
        
    }
    
}
