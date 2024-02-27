package day04;

import sun.applet.Main;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.print();
        test.print(1);
        test.print(1,2);
    }

    public void mOL(int num){
        System.out.println(num*num);
    }
    public void mOL(int num1,int num2){
        System.out.println(num1*num2);
    }
    public void mOL(String message){
        System.out.println(message);
    }
    //求两个int的最大值
    public  int max(int i ,int j){
        return (i>=j)?i:j;
    }
    public  double max(double d1 ,double d2){
       return (d1>=d2)?d1:d2;
    }
    public  double max(double d1 ,double d2,double d3){
       double maxnum = max(d1,d2);
       return max(maxnum,d3);
    //   return (max(d1,d2)>d3)?max(d1,d2):d3;
    }

    public void print(int ... nums){
        System.out.println("12");
    }

}
