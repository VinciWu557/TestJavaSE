/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/17 - 03 - 17 - 15:43
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestVar03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        num1 = num2;
        num2 = num2 +10;
        num1 = num2 -10;
        num2 = num1;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
