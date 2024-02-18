/**
 * 1、特征值：平均值 最大值 最小值
 * 2、数组元素的赋值
 * 3、数组的复制
 * 4、数组的反转
 */


package day03;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        double random =Math.random();
        //int number1 =(int)(Math.random()(max-min+1)+min):
        int sum =0;
        int max =arr[0];
        int min = 999;
        for(int i=0;i<=arr.length-1;i++){
            int number = (int)(Math.random()*90+10);
            arr[i] = number;
            sum += arr[i];
            if (max<=arr[i]){
                max = arr[i];

            }
            if (min>=arr[i]){
                min = arr[i];
            }
            System.out.println(i+"arr[i]"+arr[i]);
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
        System.out.println("sum"+sum);
        System.out.println("avg"+sum/arr.length);

        System.out.println("===================================");
        System.out.println("去掉一个最高分和一个最低分后其余8位评委打分的平均值");

        int arr1[] = new int[]{5,4,6,8,9,8,1,2,7,3};
        int sum1 =0;
        int min1 = arr1[0];
        int max1 = arr1[0];
        for (int a = 0;a<arr1.length-1;a++){
            if(min1>arr1[a]){
                min1 = arr1[a];

            }

            if (max1<arr1[a]){
                max1 = arr1[a];
            }


        }
        for (int b=0;b<arr1.length-1;b++){
            if(arr1[b]==min1){
                arr1[b]=0;
            }
            if(arr1[b]==max1){
                arr1[b]=0;
            }
            sum1+=arr1[b];

        }
        //System.out.println();

        System.out.println(sum1/8);
    }
}
