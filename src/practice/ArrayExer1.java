package practice;

//数组元素的翻转储存

public class ArrayExer1 {
    public static void main(String[] args) {
        int[] arr1;
        int num = 0;
        arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for(int i =0;i<=arr1.length/2;i++){
            //System.out.println(arr1.length/2);
                num = arr1[i];
                arr1[i] = arr1[arr1.length-1-i];
                arr1[arr1.length-1-i] = num;
        }
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println(arr1.length);
    }

}
