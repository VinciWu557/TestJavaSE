/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/17 - 03 - 17 - 20:18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestVar10{
    public static void main(String[] args){
        //类型转换的两种形式：
        double d = 6;//int-->double  自动类型转换
        System.out.println(d);
        int i = (int)6.5;
        //double--->int
        //强制类型转换 （强转）
        //若不强制转换(int i = 6.5;),则会报错,这是因为发生精度缺失 (八字节到四字节)
        //不存在四舍五入,是直接去除小数点后的数字
        System.out.println(i);

        //在同一个表达式中，有多个数据类型的时候，应该如何处理：
        //多种数据类型参与运算的时候，整数类型，浮点类型，字符类型都可以参与运算
        //唯独布尔类型不可以参与运算 (加号属于二元运算符)。
        //double d2 = 12+1294L+8.5F+3.81+'a'+true;
        double d2 = 12+1294L+8.5F+3.81+'a';
        System.out.println(d2);
                /*
                类型级别-内存的字节数,能存储的种类越多,级别越高：(从低到高的)
                byte,short,char-->int--->long--->float--->double
                级别用来做什么？
                当一个表达式中有多种数据类型的时候，要找出当前表达式中级别最高的那个类型
                然后其余的类型都转换为当前表达式中级别最高的类型进行计算。
                double d2 = 12+1294L+8.5F+3.81+'a';
                          = 12.0+1294.0+8.5+3.81+97.0
                */
        int i2 = (int)(12+1294L+8.5F+3.81+'a');
        System.out.println(i2);
                /*
                在进行运算的时候 (类型级别)：
                左=右  : 直接赋值
                左<右  ：强转
                左>右  ：直接自动转换
                */

        //以下情况属于特殊情形：对于byte，short，char类型来说
        //只要在他们的表数范围中，赋值的时候就不需要进行
        //强转了直接赋值即可。
        byte b = 12;
        System.out.println(b);
        byte b2 = (byte)270;
        //byte范围 -128~127
        System.out.println(b2);
    }
}