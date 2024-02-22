package day04;

public class FiledTest {
    public static void main(String[] args) {
        Persons p1 = new Persons();
        System.out.println(p1.name);

    }
}
class Persons{
        //属性
        String name;
        int age;

        public  void eat(){
            String food = "shift";//局部变量,不可以用任何权限修饰符进行修饰
            System.out.println(""+food);
        }
        public void sleep(int hour){
            System.out.println(name+"sleep:"+hour);

        }

}
