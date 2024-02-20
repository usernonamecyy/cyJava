package practice;

public class ArrayExer0 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1= new int[]{2,3,5,7,11,13,17,19};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);

        }
        System.out.println();
        arr2 = arr1;
        for (int i =0;i<arr2.length;i++){
            if (i % 2 == 0) {
                arr2[i] = i;
            }
            System.out.println(arr2[i]);
            }
        System.out.println(arr1);//输出的是arr1的内存地址
        System.out.println(arr2);
        }
    }

