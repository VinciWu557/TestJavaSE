/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 10:13
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe05 {
    public static void main(String[] args){
        int a = 5;
        //++的优先级大于+
        //规则：看++在前还是在后，如果++在后：先运算，后a加1   如果++在前，先a加1，后运算
        //a=5,先计算第一个a++,由于++在后,先计算a+(a++), 第二个(a++)视作一个整体,后自身+1
        //a=6,故5+6=11,第一个(a++)使得a=7
        int num1 = a++ + a++;
        int num2 = a++ + ++a;
        int num3 = ++a + a++;
        int num4 = ++a + ++a;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
