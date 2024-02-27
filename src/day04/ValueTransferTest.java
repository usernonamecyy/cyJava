package day04;


/**
 * 形参:在定义方法时，方法名后面括号()中声明的变量称为形式参数，简称形参。
 * 在调用方法时，方法名后面括号()中的使用的值/变量/表达式称为实际参数，简称实参。
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1、基本数据类型的局部变量
        int m=10;
        int n=m;//传递的是数据值
        System.out.println("m:"+m+"  n:"+n);
        m++;
        System.out.println("m:"+m+"  n:"+n);
        System.out.println("******************************");
        ValueTransferTest test = new  ValueTransferTest();
        test.method1(m);
        System.out.println("m"+m);

        Person p = new Person();
        p.age = 10;
        test.method2(p);
        System.out.println("p.age"+p.age);


        //2、引用数据类型的局部变量
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;//引用数据类型 传递的是地址
        arr2[0] = 10;
        System.out.println(arr1[0]);



    }

    public void method1(int m){
        m++;
    }
    public void method2(Person p){
        p.age++;
    }
}
