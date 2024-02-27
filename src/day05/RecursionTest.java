package day05;

public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        //test.method1();
        System.out.println(test.getSum(100));
     int   a=  test.getSum1(100);
        System.out.println(a);
    }

    /**
     * 如下递归方法的调用，会导致StackOverflowError

    public  void  method1(){
        System.out.println("method1");
        method1();
    }
}
     */
    public  int getSum(int num){
    int sum = 0;
    for(int i = 0;i<=num;i++){
        sum+=i;
    }
    return sum;
    }
    public  int getSum1(int num){
        if (num==1){
            return 1;
        }
        else {
            return num+getSum(num-1);
        }
    }
}
