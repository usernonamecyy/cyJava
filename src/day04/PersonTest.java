package day04;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "shuaige";
        System.out.println();
        p1.interest("bike");
        p1.sleep(8);

        Person p2 = new Person();
        p2.sleep(1000);
    }
}
