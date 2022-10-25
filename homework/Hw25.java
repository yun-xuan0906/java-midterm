/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw25;

import java.util.Scanner;

/**
 *
 * @author cloud
 */
public class Hw25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
            String s1;
            char s2;
            int sum=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入檢測字串為(end結束)：");
            s1 = scanner.nextLine();
            if(s1.equals("end")){
                break;
            }
            else{
                System.out.println("請輸入檢測的單一字元為：");
            s2 = scanner.next().charAt(0);     

            for(int i=0;i<s1.length();i++){
                if(s2==s1.charAt(i)){
                    sum++;
                } 
            }
            System.out.println("字元"+s2+"出現次數為："+sum);
            }
        }
        
        
        
    }
    
}
