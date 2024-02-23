package day04;

public class PersonSTest {
    public static void main(String[] args) {
     PersonS ps1 = new PersonS();
     ps1.name="json";
     ps1.age=3;
     ps1.gender='男';
     ps1.addAge(2);
     int currentAge = ps1.showAge();
        System.out.println(currentAge);

        PersonS ps2 = new PersonS();

    }


}
