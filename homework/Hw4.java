/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import java.util.*;
/**
 *
 * @author cloud
 */
public class Hw4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入x座標：");
        x = scanner.nextInt();
        System.out.println("請輸入y座標：");
        y = scanner.nextInt();
        double a;
        if(x==0&y==0){
            System.out.println("該點位於原點");
        }
        else if(x>0&y>0){
            a=Math.pow(x, 2)+Math.pow(y,2);
            System.out.println("該點位於第一象限，離原點距離為根號"+(int)a);
        }
        else if(x<0&y>0){
            a=Math.pow(x, 2)+Math.pow(y,2);
            System.out.println("該點位於第二象限，離原點距離為根號"+(int)a);
        }
        else if(x<0&y<0){
            a=Math.pow(x, 2)+Math.pow(y,2);
            System.out.println("該點位於第三象限，離原點距離為根號"+(int)a);
        }
       else if(x>0&y<0){
            a=Math.pow(x, 2)+Math.pow(y,2);
            System.out.println("該點位於第四象限，離原點距離為根號"+(int)a);
        }
       else if(x==0&y>0){
            a=Math.pow(y,2);
            System.out.println("該點位於上半平面Y軸上，離原點距離為根號"+(int)a);
        }
       else if(x==0&y<0){
            a=Math.pow(y,2);
            System.out.println("該點位於下半平面Y軸上，離原點距離為根號"+(int)a);
        }
       else if(x>0&y==0){
            a=Math.pow(x,2);
            System.out.println("該點位於右半平面X軸上，離原點距離為根號"+(int)a);
        }
       else if(x<0&y==0){
            a=Math.pow(x,2);
            System.out.println("該點位於左半平面X軸上，離原點距離為根號"+(int)a);
        }
    }
    
}
