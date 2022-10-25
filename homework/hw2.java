/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入度數：");
        num = scanner.nextInt();
        
        if(num<=120){
            a=num*2.10;
            b=num*2.10;
            System.out.println("Summer months:"+a);
            System.out.println("Non-Summer months:"+b);
        }
        else if (num>120 & num<=330){
            a=num*3.02;
            b=num*2.68;
            System.out.println("Summer months:"+Math.round(a*100)/100.0);
            System.out.println("Non-Summer months:"+Math.round(b*100)/100.0);
        }
        else if(num>330 & num<=500){
            a=num*4.39;
            b=num*3.61;
            System.out.println("Summer months:"+Math.round(a*100)/100.0);
            System.out.println("Non-Summer months:"+Math.round(b*100)/100.0);
        }
        else if(num>500 & num<=700){
            a=num*4.97;
            b=num*4.01;
            System.out.println("Summer months:"+Math.round(a*100)/100.0);
            System.out.println("Non-Summer months:"+Math.round(b*100)/100.0);
        }
        else if(num>700){
            a=num*5.63;
            b=num*4.50;
            System.out.println("Summer months:"+Math.round(a*100)/100.0);
            System.out.println("Non-Summer months:"+Math.round(b*100)/100.0);
        }
    }
    
}
