/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String s1;
     Scanner scanner = new Scanner(System.in);
     System.out.println("請輸入月租費形式及通話時間：");
     s1 = scanner.nextLine();
     String s2[]=s1.split(",");
     System.out.println(Arrays.toString(s2));
     int plan=Integer.parseInt(s2[0]);
     int time=Integer.parseInt(s2[1]);
     System.out.println(plan);
     System.out.println(time);
     Double ans;
     Double money;
     switch(plan){
         case 186:
             money=time*0.09;
             if (money<=plan){
                 ans=money*0.9;
             }
             else{
                 ans=money*0.8;
             }
             System.out.println("通會費為："+Math.round(ans));
             break;
         case 386:
             money=time*0.08;
             if (money<=plan){
                 ans=money*0.8;
             }
             else{
                 ans=money*0.7;
             }
             System.out.println("通會費為："+Math.round(ans));
             break;
         case 586:
             money=time*0.07;
             if (money<=plan){
                 ans=money*0.7;
             }
             else{
                 ans=money*0.6;
             }
             System.out.println("通會費為："+Math.round(ans));
             break;
         case 986:
             money=time*0.06;
             if (money<=plan){
                 ans=money*0.6;
             }
             else{
                 ans=money*0.5;
             }
             System.out.println("通會費為："+Math.round(ans));
             break;
     }
        
        
    }
    
}
