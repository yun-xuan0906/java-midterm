/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String s1,s2,s;
       Scanner scanner = new Scanner(System.in);
       System.out.println("請輸入M及N為：");
       s = scanner.nextLine();
       System.out.println("M N：" + s );
       System.out.println("請輸入矩陣第一列：");
       s1 = scanner.nextLine();
       System.out.println("矩陣第一列為：" + s1 );
       System.out.println("請輸入矩陣第二列：");
       s2 = scanner.nextLine();
       System.out.println("矩陣第二列為：" + s2 );
        
       String a[]=s.split(" ");
       String a1[]=s1.split(" ");
       String a2[]=s2.split(" ");
       int mn[]=new int[2];
       
       for(int i=0;i<2;i++){
           mn[i]=Integer.parseInt(a[i]);
       }
       int m[][]=new int[2][mn[1]];
       for(int i=0;i<a1.length;i++){
           m[0][i]=Integer.parseInt(a1[i]);
       }
       for(int i=0;i<a2.length;i++){
           m[1][i]=Integer.parseInt(a2[i]);
       }
       //System.out.println(Arrays.toString(mn));
       //System.out.println(Arrays.deepToString(m));
       System.out.println("輸出矩陣：");
       //轉置
       
       for(int i=0;i<mn[1];i++){
           for(int j=0;j<mn[0];j++){
               System.out.print(m[j][i]+" ");
           }
           System.out.println("");
       }
       
       
        
        
        
        
    }
    
}
