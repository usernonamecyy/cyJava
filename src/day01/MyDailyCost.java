import java.math.BigDecimal;
import java.util.Scanner;

public class MyDailyCost {
    //先打折再-2


    public static void main(String[] args) {
        int daysum ;
        int day = 0;
        BigDecimal buscost = new BigDecimal("1");
        BigDecimal subcost = new BigDecimal("6");
        BigDecimal sumgocost = new BigDecimal("0");
        BigDecimal sumbackcost = new BigDecimal("0");
        BigDecimal dailycost = new BigDecimal("0");
        BigDecimal allpay = new BigDecimal("0");

        for (daysum=24;day<daysum;day++){
            if (allpay.compareTo(new BigDecimal("50")) < 0){
                BigDecimal sum1 = buscost.multiply(new BigDecimal("0.9"));
                BigDecimal sum2 = subcost.multiply(new BigDecimal("0.9"));
                BigDecimal sum4 = subcost.multiply(new BigDecimal("0.9"));
                sumgocost = sum1.add(sum2).subtract(new BigDecimal("2"));
                allpay  = allpay.add(sumgocost).add(sum4);

                System.out.println("sumgocost:"+""+sumgocost);
                System.out.println("backcost"+""+sum4);
                System.out.println("allpay"+""+allpay);

            }
            else if (allpay.compareTo(new BigDecimal("50")) > 0 && allpay.compareTo(new BigDecimal("100")) < 0)
            {
                BigDecimal sum1 = buscost.multiply(new BigDecimal("0.7"));
                BigDecimal sum2 = subcost.multiply(new BigDecimal("0.7"));
                BigDecimal sum4 = subcost.multiply(new BigDecimal("0.7"));
                sumgocost = sum1.add(sum2).subtract(new BigDecimal("2"));
                allpay  = allpay.add(sumgocost).add(sum4);

                System.out.println("sumgocost:"+" "+sumgocost);
                System.out.println("backcost"+" "+sum4);
                System.out.println("allpay"+" "+allpay);
            }
            else {
                BigDecimal sum1 = buscost.multiply(new BigDecimal("0.5"));
                BigDecimal sum2 = subcost.multiply(new BigDecimal("0.5"));
                BigDecimal sum4 = subcost.multiply(new BigDecimal("0.5"));
                sumgocost = sum1.add(sum2).subtract(new BigDecimal("2"));
                allpay  = allpay.add(sumgocost).add(sum4);

                System.out.println("sumgocost:"+" "+sumgocost);
                System.out.println("backcost"+" "+sum4);
                System.out.println("allpay"+" "+allpay);
            }
        }


    }
}
