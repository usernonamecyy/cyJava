package day03;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3};
        int arr2[] = new int[]{1,2,3};
        int arr3[] = new int[]{84,1,99,35,14,2,3};

       boolean isEquals =  Arrays.equals(arr1,arr2);
        System.out.println(isEquals);//比的是内容
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,20);
        Arrays.sort(arr3);//快速排序
        System.out.println(Arrays.toString(arr3));
        int index =  Arrays.binarySearch(arr2,1);
        System.out.println(index);
    }
}
