package day04;

/**
 * 1、权限修饰符：private\ \protected \public
 * 2、返回值类型:描述调用完此方法时，是否需要返回结果。
 *          无返回值类型：void、sout的println()
 *          有返回值类型：需要使用return
 *3、方法名：属于标识符。需要满足标识符的规定规范。“见名知意”
 *4、形参列表，形参，属于局部变量，且可以声明多个。
 *              格式：（形参类型1 形参1，形参类型2 形参2）
 *
 *              方法内不能定义方法
 */
public class MethodTest {
}
class Personss{
    String name;
    int age;
    char gender;

    public void eat(){//权限修饰符 返回值类型 方法名（形参列表）{方法体}
        System.out.println();
    }
    public void sleep(int hour){
        System.out.println("sleep:"+hour);
    }
    public String interests(String habbit){
        String info = ""+habbit;
        System.out.println(info);
        return info;//也可以 return "46512"
    }
    public int getAge(){
        return age;
    }

}
