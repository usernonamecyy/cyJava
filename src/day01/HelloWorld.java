package day01;

import java.util.Scanner;

/**
 * 今天是9.29，从p33开始学习Java
 * @author Yuan
 *
 * 标识符不可以数字开头，不能有空格，严格区分大小写
 * 不可使用关键字和保留字，但是可以包含
 */

/**
 * 包名：多单词组成时，所有字母都小写
 * 类名，接口名：所有单词首字母大写
 * 变量名，方法名：首单词首字母小写，后续单词首字母大写
 * 常量名：所有字母大写，多个单词时：XXX_XXX_XXX
 */

/**
 * 变量的构成包括：数据类型、变量名、存储的值
 * 基本数据类型：          整型：byte\short\int\long
 *                         浮点型：float\double
 *                         字符型：char
 *                         布尔型：boolean
 * 引用数据类型：          类（class） 数组（array） 接口（interface） 枚举（enum） 注解（annotation） 记录（record）
 */

public class HelloWorld {
    public static void main(String[] args) {
        int myAge = 12;
        int myNum;
        char gender = '男';
        myNum = 10;
        System.out.println(gender);
        System.out.println(myAge);
        System.out.println();//专门拿来换行
        System.out.println(myNum);
        System.out.println("Hello World!");
        System.out.println("====================");
        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的分数：");
         int num = scanner.nextInt();
         if (num == 100){
             System.out.println("macbook get");

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
