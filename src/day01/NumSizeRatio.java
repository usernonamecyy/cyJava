package day01;

import java.util.Scanner;

public class NumSizeRatio {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        num3 = scanner3.nextInt();

        if(num1>num2){
            if (num2>num3){
                System.out.println(num3+"<"+num2+"<"+num1);
            }
            //num2<num3
            else if (num1>num3){
                System.out.println(num2+"<"+num3+"<"+num1);
            }
            //num1<num3
            else {
                System.out.println(num2+"<"+num1+"<"+num3);
            }
            }
        else if (num2>num3){
            //1<2
            if(num1>num3){
                System.out.println(num3+"<"+num1+"<"+num2);
            }
            else {
                //1<3
                System.out.println(num1+"<"+num3+"<"+num2);
            }

            }else {
            System.out.println(num1+"<"+num2+"<"+num3);
        }

        }


    }

