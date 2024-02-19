package practice;

public class YangHExample {
    public static void main(String[] args) {
        //创建
        int[][] yangHui = new int[10][];
        //初始化
        for(int i=0;i<yangHui.length;i++){
                yangHui[i]=new  int[i+1];
                yangHui[i][0] = yangHui[i][i] = 1;
                if(i>=2){
                    for (int j =1;j<yangHui[i].length-1;j++){
                        yangHui[i][j] = yangHui[i-1][j]+yangHui[i-1][j-1];
                    }
                }

        }
        //赋值


        //遍历
        for(int i=0;i<yangHui.length;i++){
            for(int j =0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
