/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 9:42
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
import java.util.Scanner;
public class TestOpe02 {
    public static void main(String[] args) {
        //实现功能：任意给出一个四位数，求出每位上的数字并输出
        //1.任意输入一个四位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数:");
        int num = sc.nextInt();

        //2.求出每位上的数字:
        /*
        1234
        1234/1000=1
        1234%1000=234 234/100=2
        1234%100=34 34/10=3
         */
        //2.1 千位
        System.out.print("该四位数千位上的的数字是:");
        System.out.print(num / 1000+"\n");
        //2.2 百位
        System.out.print("该四位数百位上的的数字是:");
        System.out.print(num% 1000 / 100+"\n");
        //2.3 十位
        System.out.print("该四位数十位上的的数字是:");
        System.out.print(num% 100 / 10+"\n");
        //2.4 个位
        System.out.print("该四位数个位上的的数字是:");
        System.out.print(num% 10 +"\n");
    }

}
