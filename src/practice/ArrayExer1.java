package practice;

//数组元素的翻转储存
//newArray[arr.length-1-i] = arr[i];
//for（）里可以加逗号

public class ArrayExer1 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        int num = 0;
        arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        arr2 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for(int i =0;i<=arr1.length/2;i++){
            //System.out.println(arr1.length/2);
                num = arr1[i];
                arr1[i] = arr1[arr1.length-1-i];
                arr1[arr1.length-1-i] = num;
        }
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for(int i =0,j=arr2.length-1;i<j;i++,j--){
                int num1 = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = num1;
        }
        for (int a =0;a<arr2.length;a++){
            System.out.println(arr2[a]);
        }
    }

}
