package day03;

import javax.xml.transform.Source;

/**
 *
 */
public class BreakContinueTest {
    public static void main(String[] args) {
            for(int i =1;i<=10;i++){
                if(i%4==0){
                    System.out.println("33333");
                    continue;//跳出当前的循环
                }
                if (i%6==0){
                    System.out.println("886");
                    break;//跳出当前循环结构，开发中 break的使用频率远大于continue
                }
                System.out.println("111");
            }
    }
}
