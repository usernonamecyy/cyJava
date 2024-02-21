package practice;

//扩容
public class ArrayExer2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};//初始化完长度是固定的
        //扩容
        int [] newArr = new int[arr.length<<1];
        for(int i =0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        //把10,20,30塞进去
        newArr[arr.length] = 10;
        newArr[arr.length+1] = 20;
        newArr[arr.length+2] = 30;
        arr = newArr;
        for (int j =0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        //删掉索引为4的
        int deleteIndex = 4;

        for(int a =deleteIndex;a<arr.length-1;a++){
            arr[a]=arr[a+1];
        }
        System.out.println();
        arr[arr.length-1]=0;
        for (int j =0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }
}
