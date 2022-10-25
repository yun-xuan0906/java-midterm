/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8;
import java.util.*;

/**
 *
 * @author cloud
 */
public class Hw8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String s1,s2;
       Scanner scanner = new Scanner(System.in);
       System.out.println("請輸入第一行正整數為：");
       s1 = scanner.nextLine();
       System.out.println("您輸入的字串為：" + s1 );
       System.out.println("請輸入第二行數列的數字：");
       s2 = scanner.nextLine();
       System.out.println("第二行數列的數字為：" + s2 );
       
       
       
       String s3[]=s2.split(" ");
       int[] arr=new int[s3.length];
       for(int i=0;i<s3.length;i++){
           arr[i]=Integer.parseInt(s3[i]);
       }
       Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s3.length; i++) {
            if (map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                map.put(arr[i], temp + 1);
            }else {
                map.put(arr[i],1);
            }
        }
        
        Collection count = map.values();
        int maxcount = (int) Collections.max(count);
        int maxnum;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if (maxcount == entry.getValue()){
            maxnum= entry.getKey();
            if (maxcount==1){
                System.out.println("每個數字剛好只出現一次");
                break;
                }
            else{
                System.out.println("最大出現次數的數字為："+maxnum);
                System.out.println("出現次數："+maxcount);
                }
            }   
        }
    }
}