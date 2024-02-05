package practice;

import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {

        double balance = 0.0;
        boolean flag = true;

        do{
            System.out.println("========================");
            System.out.println("1、存");
            System.out.println("2、取");
            System.out.println("3、查看余额");
            System.out.println("4、退出");
            System.out.println("选择：");
            Scanner scan  = new Scanner(System.in);
            int selection = scan.nextInt();
       switch (selection){

           case 1:
               System.out.println("要存多少");
               double cun = scan.nextDouble();
               balance+=cun;
               System.out.println("存好了 ，余额是："+balance);
               break;
           case 2:
               System.out.println("要取多少");
               double qu = scan.nextDouble();
               if (qu<balance){

                   balance=balance-qu;
                   System.out.println("好的,取了"+qu+"还剩"+balance);
               }else {
                   System.out.println("不足取个啥");
               }
               break;
           case 3:
               System.out.println(balance);
               break;
           case 4:
               System.out.println("下次再来");
               flag = false;
               break;
            default:
                System.out.println("886");

       }
    }while(flag);
    }
}
