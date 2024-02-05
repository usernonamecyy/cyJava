package practice;

public class GCDExample {
    public static void main(String[] args) {
        int m = 12;
        int n = 20;

        // 找出较小的数
        int min = (m < n) ? m : n;

        // 从1到较小的数循环，找出两个数的公约数
        int max =1;
        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("公约数: " + i);
            }

        }

        // 上面的循环找到的最后一个i即为最大公约数
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }

        System.out.println("最大公约数: " + gcd);
    }
    }

