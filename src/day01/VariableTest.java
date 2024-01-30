package day01;

import java.util.Scanner;

/**
 *在Java中，单引号()用于表示字符，而加号(+)用于连接字符。在这里，你想要打印出数字，但由于使用了单引号，实际上是在打印字符的ASCII码值。因此，num1+'>'+num2+'>'+num3'将被解释为字符的ASCII码相加。
 * 如果你想正确打印数字和字符之间的文本，应该使用双引号('"")而不是单引号，
*/
public class VariableTest {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if(num1>num2){
            if (num2>num3){
                System.out.println(num1+","+num2+","+num3);
            }
            else {
                //num3>num2  num1?num3
                if(num1>num3){
                    System.out.println(num1+","+num3+","+num2);
                }
                else {
                    System.out.println(num3+","+num1+","+num2);
                }

            }
        }
               //num3>num2
        else {
            //num2>num1
            if(num1>num3){
                System.out.println(num2+","+num1+","+num3);

            }
            else{
                //num3>num1
                    if (num2>num3){
                        System.out.println(num2+","+num3+","+num1);
                    }
                    else{
                        //num3>num2
                        System.out.println(num3+","+num2+","+num1);
                    }
            }
        }
    }
}

