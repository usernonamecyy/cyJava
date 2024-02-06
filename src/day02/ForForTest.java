package day02;

public class ForForTest {
    public static void main(String[] args) {
        /**
         * 外层控制行数，内层控制列数
         *              j(第几行)          i（每一行中的*个数）
         *  *****           1               5                         =》》》》i+j=7-----  i=7-j
         *
         *  ****            2               4
         *
         *  ***             3               3
         *
         *  **              4               2
         *
         *  *               5               1
         *
         *
         */
        for(int j = 1;j<=5;j++) {
            for (int i = 1; i<=6-j;i++) {

                System.out.print("*");


            }
            System.out.println("\n");
        }
        //System.out.println("\n###");
    }
}
