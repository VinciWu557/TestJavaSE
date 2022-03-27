/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/17 - 03 - 17 - 15:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestVar01 {
    public static void main(String[] args) {
        //变量的声明(定义变量)(以年龄为案例讲解)
        //java是一个强类型的语言,只要声明变量,就必须定义类型
        int age;
        //对变量进行赋值操作
        age = 10;
        age = 12;
        age = 20;
        age = age+4;
        age = 9;
        age = 9;
        System.out.println(age);
        //变量的使用
        System.out.println(age - 2);
        System.out.println(age + 10);
        int num = age +66;
        System.out.println(num);
    }
}
