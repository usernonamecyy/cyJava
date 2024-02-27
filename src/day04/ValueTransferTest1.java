package day04;

public class ValueTransferTest1 {
    public static void main(String[] args) {
        int m  = 10;
        int n = 20;
        ValueTransferTest1 test1 =new  ValueTransferTest1();
        //ValueTransferTest1 test2 =new  ValueTransferTest1();
        test1.swap(m,n);
        System.out.println("*************");
        Data data = new Data();
        data.a = 10;
        data.b = 20;
        test1.swapdata(data);



    }

    public  void swap(int m ,int n){
        int temp = m;
        m=n;
        n=temp;
        System.out.println("m:"+m+"  n:"+n);
    }

    public void swapdata(Data data){
        int temp = data.a;
        data.a = data.b;
        data.b = temp;
        System.out.println("a:"+data.a+"  b:"+data.b);
    }
}
class Data{
    int a;
    int b;
}
