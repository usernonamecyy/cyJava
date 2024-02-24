package practice;

import java.util.Scanner;

public class Exer02 {
    int chang=10;
    int gao=8;

    public void printStar(){
        for (int j=1;j<=gao;j++){
            for (int i=1;i<=chang;i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public int mathStart(){
        int area;
        for (int j=1;j<=gao;j++){
            for (int i=1;i<=chang;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        area =chang*gao;
        return area;
    }

    public int randomStar(){
        Scanner scan = new Scanner(System.in);
        int m,n;
        m=scan.nextInt();
        n=scan.nextInt();
        for (int i=1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
    public void findArea(double r){

            System.out.println(3.14*r*r);
        }

}
