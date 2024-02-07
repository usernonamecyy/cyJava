package practice;

/**i         j    ->>>>>2i-1=j   j<=
 * 1        1       4               1       7
 * 2        3       3               2       5
 * 3        5       2               3       3
 * 4        7       1               4       1
 */

public class ForExample {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int m =1;m<=5-i;m++){
                System.out.print(" ");
            }
            for (int j =1;j<=2*i-1;j++){
                //System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a =1;a<=4;a++){
            for (int b =1;b<=a;b++){
                System.out.print(" ");
            }
            for (int c = 1;c<=2*(5-a)-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
