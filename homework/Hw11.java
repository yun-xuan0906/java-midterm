/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11;

import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入月及日為：");
        s = scanner.nextLine();
        System.out.println("出生日期為：" + s );
        String a[]=s.split(" ");
        String month=a[0];
        int day=Integer.parseInt(a[1]);
       
        if(month.equals("01")&day>=21 || month.equals("02")&day<=18){
            System.out.println("星座為：Aquarius");
        }
        if(month.equals("02")&day>=19 || month.equals("03")&day<=20){
            System.out.println("星座為：Pisces");
        }
        if(month.equals("03")&day>=21 || month.equals("04")&day<=20){
            System.out.println("星座為：Aries");
        }
        if(month.equals("04")&day>=21 || month.equals("05")&day<=21){
            System.out.println("星座為：Taurus");
        }
        if(month.equals("05")&day>=22 || month.equals("06")&day<=21){
            System.out.println("星座為：Gemini");
        }
        if(month.equals("06")&day>=22 || month.equals("07")&day<=22){
            System.out.println("星座為：Cancer");
        }
        if(month.equals("07")&day>=23 || month.equals("08")&day<=23){
            System.out.println("星座為：Leo");
        }
        if(month.equals("08")&day>=24 || month.equals("09")&day<=23){
            System.out.println("星座為：Virgo");
        }
        if(month.equals("09")&day>=24 || month.equals("10")&day<=23){
            System.out.println("星座為：Libra");
        }
        if(month.equals("10")&day>=23 || month.equals("11")&day<=23){
            System.out.println("星座為：Leo");
        }
        if(month.equals("11")&day>=23 || month.equals("12")&day<=21){
            System.out.println("星座為：Sagittarius");
        }
         if(month.equals("12")&day>=22 || month.equals("01")&day<=20){
            System.out.println("星座為：Capricorn");
        }
        
    }
    
}
