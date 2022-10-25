/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入西元年：");
        year = scanner.nextInt();
        
        a=year%12;
        
        switch(a){
            case 4:
                System.out.println("鼠");
                break;
            case 5:
                 System.out.println("牛");
                 break;
            case 6:
                 System.out.println("虎");
                 break;
            case 7:
                 System.out.println("兔");
                 break;
            case 8:
                 System.out.println("龍");
                 break;
            case 9:
                 System.out.println("蛇");
                 break;
            case 10:
                 System.out.println("馬");
                 break;
            case 11:
                 System.out.println("羊");
                 break;
            case 0:
                 System.out.println("猴");
                 break;
            case 1:
                 System.out.println("雞");
                 break;
            case 2:
                 System.out.println("狗");
                 break;
            case 3:
                 System.out.println("豬");
                 break;
        }
        
    }
    
}
