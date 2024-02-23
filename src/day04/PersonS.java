package day04;

public class PersonS {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("Studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int adddAge){
        age+=adddAge;
    }
}
