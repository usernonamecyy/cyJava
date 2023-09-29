package day01;

import java.util.Scanner;

/**
 * 今天是9.29，从p33开始学习Java
 * @author Yuan
 *
 * 标识符不可以数字开头，不能有空格，严格区分大小写
 * 不可使用关键字和保留字，但是可以包含
 * 类名：所有字母小写
 * 类名、接口名 首字母大写
 * 变量名：首单词小写，后续的首字母大写
 * 常量名：xxx_xxx_xxx
 */
public class HelloWorld {
    public static void main(String[] args) {
        int myAge = 12;
        int myNum;
        myNum = 10;
        System.out.println(myAge);
        System.out.println(myNum);
//      System.out.println("Hello World!");
        System.out.println("====================");
        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的分数：");
         int num = scanner.nextInt();
         if (num == 100){
             System.out.println("BWM get");

         }
         else if (80<num&&num<=99){
             System.out.println("iphone get");

         }
         else if(60<=num&&num<=80){
             System.out.println("ipad get");
         }
         else{
            System.out.println("吃屁吧你");
        }
    }


}
