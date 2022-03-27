/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/17 - 03 - 17 - 17:24
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestVar08 {
    public static void main(String[] args){
        char ch1 = 'A';
        System.out.println(ch1);//A - 对应ASCII码中的65
        System.out.println(ch1+90);//155
        System.out.println(155-ch1);//90
        //char类型我们看到的样子就是它本身的字面常量
        //但是底层在进行计算的时候，实际上是按照ASCII码进行计算的
        //之前说char类型是按照Unicode码表进行存储的
        //(Unicode兼容了ASCII码，Unicode的前128位置ASCII)

        char ch2 = '中';
        System.out.println(ch2);// 中
        System.out.println(ch2+90);// 20103
        System.out.println(20103-ch2);// 90

        //转换：
        int num1 = (int)ch2;
        System.out.println(num1);//20013

        char ch = (char)20013;
        System.out.println(ch);

        int num2 = '中';//存入的是20013
        char ch5 = 20013;//存入的是'中'
        System.out.println(ch5);

        //面试题：
        char ch6 = '2'+2;//运算时看底层,'2'对应50,52对应'4'
        System.out.println(ch6);//'4'--->4
    }
}
