package day03;

/**
 * 1、顺序查找
 * 2、二分查找
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        //顺序查找
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int target = 5;
        Boolean Flag = true;
        for (int i =0;i<arr1.length;i++){
            if (arr1[i]==target){
                System.out.println("target:"+i);
                Flag = false;
            }
        }
        if(Flag){
            System.out.println("not found");
        }

        //二分查找
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int target1 = 5;
        int head = 0;
        int end = arr2.length-1;
        boolean isFlag = false;//判断找没找到
        while (head<=end){
            int middle = (head+end)/2;
            if (target1==arr2[middle]){
                System.out.println("位置："+middle);
                isFlag = true;
                break;
            }
            else if (target1>arr2[middle]){
                    head = middle+1;
            }else {
                end = middle-1;
            }
        }
        if(!isFlag){
            System.out.println("nono");
        }
    }
}
