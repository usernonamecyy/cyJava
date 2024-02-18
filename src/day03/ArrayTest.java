package day03;

import java.sql.SQLOutput;

public class ArrayTest {
    public static void main(String[] args) {
        //1、一维数组的声明和初始化
        //声明
        double[] prices;
        //静态初始化
        prices = new double[]{20.32,43.22,54.21};

        //声明和动态初始化
        //一旦初始化完成，长度就确定了 并且不可更改
        String[] food = new String[3];

        //其他正确的写法
        int arr[] = new int[2];
        String arr1[] = new String[4];
        char arr2[] = new char[8];
        boolean arr3[] = new boolean[2];
        //int[] arr1 = {1,2,3,4};

        //2、数据元素的调用
        System.out.println(prices[0]);//ctrl+d 可以复制

        food[0]="meat";
        System.out.println(food[0]);

        //3、数组的长度
        System.out.println(prices.length);
        System.out.println(food.length);

        //4、如何遍历数组
        for(int i =0;i<prices.length;i++){
            System.out.println(prices[i]);
        }
        System.out.println(arr[0]);
        System.out.println(arr1[0]);
        if(arr2[0]==0){
            //System.out.println(arr2[0]);
            System.out.println("1111");
        }
        else {
            System.out.println("2222");
        }
        System.out.println(arr3[1]);
        //5、内存解析
        //虚拟机栈，用于存放方法中声明的变量。比如arr arr1
        //堆，用于存放数组中的实体，例如prices = new double[]{20.32,43.22,54.21};中的20.32,43.22,54.21
        //System.out.println(prices);

    }

}
