package practice;

public class ArrRandomExample {
    public static void main(String[] args) {
        //六个随机数(1-30) 不能相同
        int arr[] = new int[6];
        double random = Math.random();
        for(int i=0;i<arr.length;i++){
                int number = (int)(Math.random()*30+1);
                Boolean Flag = false;
                arr[i] = number;
                while (true){
                    for (int j=0;j<i;j++){
                        if (arr[i]==arr[j]){
                            Flag=true;
                            System.out.println(arr[i]);
                            break;
                        }
                    }
                    if (Flag){
                        arr[i] = (int)(Math.random()*30+1);
                        Flag = false;
                        continue;
                    }
                    break;
                }

            }
            for (int i = 0;i<arr.length;i++){
                System.out.print ("\t"+arr[i]);
            }


    }
}
