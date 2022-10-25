/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String s1;
       Scanner scanner = new Scanner(System.in);
       System.out.println("請輸入一字串：");
       s1 = scanner.nextLine();
       System.out.println("您輸入的字串為：" + s1 );
       
       String s2[]=s1.split(",");
       String a1[]=new String[s2.length];
       for(int i=0;i<s2.length;i++){
           a1[i]=s2[i];
       }
       Arrays.sort(a1);
       
       String a2[]=new String[a1.length];
       int j=a1.length-1;
       for(int i=0;i<a1.length;i++){
           a2[i]=a1[j];
           j--;
       }
       String x1=String.join("", a1);
       String x2=String.join("", a2);
       int ans;
       int z1=Integer.parseInt(x1);
       int z2=Integer.parseInt(x2);
       ans=z2-z1;
       System.out.println("最大值與最小值相差："+ans);
        
        
        
    }
    
}
