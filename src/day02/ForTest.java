/**
 * for循环
 * for(1;2;3){
 *
 * }
 */

package day02;

public class ForTest {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            //i++;
            if (i % 2 == 0) {
                count++;
                sum += i;

            } else {
                System.out.println(i);
            }

        }
        System.out.println("sum" + sum + ",," + "count" + count);
        System.out.println("++++++++++++++++++++++++");
        for (int j = 100; j <= 999; j++) {
            int ge = j % 10;
            int shi = j / 10 % 10;
            int bai = j / 100;
            if (j == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println(j);
            }
        }
        System.out.println("++++++++++++++++++++++++++");


    }


}
