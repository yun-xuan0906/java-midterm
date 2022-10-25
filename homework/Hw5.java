/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入階乘值M：");
        m = scanner.nextInt();
        int n =1;
        int sum=1;
        while (sum<m){
            sum=sum*n;
            n++;
        }
        n=n-1;
        System.out.println("超過M為"+m+"的最小階層N值為:"+n);
    }
    
}
