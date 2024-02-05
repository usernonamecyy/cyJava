package day02;

/**
 * do while 至少执行一遍
 * do{
 *
 * }while()
 * @author = Yuan
 */

import java.util.Random;
import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            System.out.println("123");
            i++;
        }
        System.out.println("++++++++++++++++");
        int j =1;
        int sum=0;
        int count=0;
        while(j<=100){
            if(j%2==0){
                System.out.println(j);
                count++;
                sum+=j;
            }
            j++;
        }
        System.out.println(sum+","+count);
        System.out.println("======================================");
        int a = (int)(Math.random()*100)+1;
        Scanner scanner  = new Scanner(System.in);
        int b = scanner.nextInt();
        int count1 = 0;
        while (a!=b){
            if (a<b){
                System.out.println("大了");
            }else {
                System.out.println("小了");
            }
            b = scanner.nextInt();
            count1++;
        }
        System.out.println("123"+count1);



    }


}
