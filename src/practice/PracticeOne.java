package practice;

import jdk.internal.util.xml.impl.Input;

import java.util.Random;
import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身高，回车键结束：");
        int height = scan.nextInt();//身高
        System.out.println("请输入财富，回车键结束：");
        double money = scan.nextDouble();
        //System.out.println("请输入look（帅\\不），回车键结束：");
        //char look = scan.next().charAt(0);
        System.out.println("请输入look?（true\\false），回车键结束：");
        boolean look = scan.nextBoolean();

        if(height>=180 && money>1000 && look){
            System.out.println("就它了");
        }else if(height>=180 || money>1000 || look){
            System.out.println("jst soso");
        }else {
            System.out.println("886");
        }

        System.out.println("----------------------------");
        int score = (int)(Math.random()*100);
        System.out.println(score);
        switch (score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("no");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("yes");
                break;
            default:
                System.out.println("666666");
                break;
        }
        System.out.println("----------------------------");
        int month = scan.nextInt();
        int day = scan.nextInt();
        int sumday = 0;
        switch (month){
            case 1:
                sumday = day;
                System.out.println(month+"月，sumday一共有"+sumday+"天");
                break;
            case 2:
                sumday = day+31;

            case 3:
                sumday = day+31+28;
            case 4:
                sumday = day+31+28+31;

            case 5:
                sumday = day+31+28+31+30;

            case 6:
                sumday = day+31+28+31+30+31;
            //蠢办法所以没写完
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                default:
                    System.out.println("shucuole");



        }
        scan.close();
    }

}
