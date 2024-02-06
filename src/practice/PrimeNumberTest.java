package practice;

/**
 * 找出100以内所有的素数
 * 只能被1和他本身整除的自然数
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i =2;i<=10000;i++){
            int number = 0;
            for(int j =2;j < i;j++){
                    if(i % j==0){
                        number++;

                }
            }
            if (number==0){
                System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
