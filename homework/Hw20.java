/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw20;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cloud
 */
public class Hw20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String student [][]=
        {
            {"123","Tom","DTGD"},
            {"456","Cat","CSIE"},
            {"789","Nana","ASIE"},
            {"321","Lim","DBA"},
            {"654","Won","FDD"}
        };
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入查詢學號：");
        s = scanner.nextLine();
        for(int i=0;i<5;i++){
            if(s.equals(student[i][0])==true){
                System.out.println("學生資料為："+Arrays.toString(student[i]));
            }
            
        }
        
    }
    
}
