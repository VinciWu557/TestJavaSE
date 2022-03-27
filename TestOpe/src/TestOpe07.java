import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 13:12
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe07 {
    public static void main(String[] args) {
        //实现功能：给出三个数，求和：
        //1.输入三个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数:");
        int num3 = sc.nextInt();

        //2.求和,定义一个变量来接收和
        int num=0;
        num=num+num1;//等效: num+=num1 - 扩展赋值运算符
        num=num+num2;
        num=num+num3;
        System.out.println("三个数的和是:" + num);

        //扩展赋值运算符对字符串的效果不同
        //a+=b相当于a=a+b,但不相当于a=b+a
        //a+=b 能够自动转换数据类型 而 a=a+b 在大转小时需要进行强制转换
        String a = "s";
        String b = "b";
        System.out.println(a + b);
        System.out.println(b + a);
    }
}
