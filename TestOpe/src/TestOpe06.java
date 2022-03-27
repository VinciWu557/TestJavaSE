import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 13:07
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe06 {
    public static void main(String[] args) {
        //任意给出两个数，交换两个数并输出：
        //1.输入两个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        //2.引入中间变量
        int t = 0;
        //3.交换两个数并输出
        t=num1;
        num1=num2;
        num2=t;
        System.out.println("交换后的第一个数是:" + num1);
        System.out.println("交换后的第二个数是:" + num2);
    }
}
