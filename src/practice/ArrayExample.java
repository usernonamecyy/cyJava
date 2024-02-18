package practice;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        //String arr[] = new String[]{"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};
        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();
        //if (num<=7&&num>=0){
        //    System.out.println(arr[num-1]);
        //}
        //else {
        //    System.out.println("???");
        //}
        System.out.println("下一个，请输入学生的人数:");
        int people = scan.nextInt();

        int grade[] = new  int[people];
        System.out.println("下一个，请输入学生的人成绩:");
        //int fenshu = scan.nextInt();
        String level[] = new String[]{"A","B","C","D"};
        for(int i=1;i<=people;i++){
            System.out.println("第"+i+"分数：");
            int fenshu = scan.nextInt();
            grade[i-1]=fenshu;//这里要格外注意，i是从1开始的，但是数组索引是从0开始的
            if (grade[i-1]>=90){
                System.out.println("你得到了"+level[0]);
            }
            else if (grade[i-1]<90&&grade[i-1]>=70){
                System.out.println("你得到了"+level[1]);
            }
            else if (grade[i-1]<70&&grade[i-1]>45){
                System.out.println("你得到了"+level[2]);
            }
            else {
                System.out.println("你得到了"+level[3]);
            }


        }

        int maxfenshu = grade[0];
        for (int j=0;j<grade.length;j++){
            if (grade[j]>=maxfenshu){
                maxfenshu=grade[j];
            }
        }
        System.out.println("maxfenshu:"+maxfenshu);

        //String level[] = new String[]{"A","B","C","D"};


    }
}
