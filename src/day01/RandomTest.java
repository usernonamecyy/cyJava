/**
 * 如何获取一个随机数？
 * 1、API：Math的random()
 * 下面是switch-case的用法
 * 只能让表达式和常量做相等的判断，不支持范围的判断
 * switch(表达式){
 *     case  常量1:
 *       //执行语句1;
 *       break;
 *       *
 *       *
 *       *
 *       default:
 * }
 */

package day01;

public class RandomTest {
    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println("d1:"+d1);
        int num1 = (int)(Math.random() * 101);
        System.out.println(num1);
        System.out.println("++++++++++++++++++++++++++");

        /**
         * 要生成一个范围在某个整数区间'[min，max)内的随机整数，你可以使用以下方法
         *int number1 =(int)(Math.random()(max-min)+min):
         * 这样你就能够生成'min'到'max-1'之间的随机整数了。如果你需要包括'max`在内,可以将'(max-min)修改为'(max-min +1)
         */
        int min = 1;
        int max = 5;
        int number1 = (int)(Math.random()* 4+1);
        System.out.println(number1);
        switch (number1){
            case 0:
                System.out.println("zero");
                break;//break后就跳出当前循环
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
             default:
                 System.out.println("oooooo");
                 break;
        }

    }
}
