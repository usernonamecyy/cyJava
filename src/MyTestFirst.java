//学习Java的第一天

/**
 * 在需要注释的位置，输入“/**”，然后按一下enter即可实现
 */
public class MyTestFirst {
    public String name;
    public String food;
    public int age;

    public void hisAge(){
        name="Baby";
        age=20;
        System.out.println("He is "+name +" and he is "+age);

    }
    public static void hisLike(){
        String food;
        food = "kfc";
        System.out.println(food);
    }

    public static void main(String[] args) {
        /** 要先构造方法并实例化*/
        String hisName;
        MyTestFirst testFirst = new  MyTestFirst();
        hisName = testFirst.name;
        System.out.println(hisName);
        testFirst.hisAge();

        System.out.println("===============");
        System.out.println("Macbooks says helloworld");
        System.out.println("windows also says helloworld");
        hisLike();

            }
        }
