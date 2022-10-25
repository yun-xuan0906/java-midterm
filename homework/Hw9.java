/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String s1,s2;
       Scanner scanner = new Scanner(System.in);
       System.out.println("請輸入s1：");
       s1 = scanner.nextLine();
       System.out.println("您輸入的s1為：" + s1 );
       System.out.println("請輸入s2：");
       s2 = scanner.nextLine();
       System.out.println("您輸入的s2為：" + s2 );
       
       String test="";
       for(int i=0;i<(s2.length()-(s2.length()-s1.length()));i++){
           test=test+s2.charAt(i);
       }
       
       if(s1.equals(test)){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
       
       
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
