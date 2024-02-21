package day04;
import java.util.Scanner;

public class Object01Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object01 p1 = new Object01();//实例化你
        p1.name = "Apple";
        p1.call();
        p1.sendMessage(":Stop");
    }

}
