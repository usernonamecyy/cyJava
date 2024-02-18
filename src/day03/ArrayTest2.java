package day03;

/**
 * 对于二维数推的理解。可以看成是一维数组array1又作为另一个一维数组array2的元素面存在。
 */
public class ArrayTest2 {
    public static void main(String[] args) {
    //1、数组元素的声明与初始化
        int[][] arr = new int[][]{{1,2,8},{3,4},{5,6}};
        //外层元素：{1,2,8},{3,4},{5,6}
        //内层元素1,2,3,4,5,6,8
        int[][] arr1 = new  int[5][4];
        double[][] arr2 = new double[2][];
        int arr3[][] = {{1,2},{5,8,6}};
        String arr4[][] = new String[3][4];
    //2、数组元素的调用
        System.out.println("arr[2][0]:"+arr[2][0]);
        System.out.println("arr[0]:"+arr[0]);

        arr4[1][1] = "tom";
        System.out.println(arr4[1][1]);
    //3、数组元素的长度
        System.out.println(arr1.length);//5  int[5][4];
        System.out.println(arr.length);//3   {1,2,8}
    //4、如何遍历
    //int[][] arr = new int[][]{{1,2,8},{3,4},{5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    //5、默认初始化

    }
}
