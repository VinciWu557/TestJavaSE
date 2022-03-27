/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 10:06
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe03 {
    public static void main(String[] args){
        //表示正数：
        System.out.println(+5);//5
        //相加操作：
        System.out.println(5+6);//11
        System.out.println(5+'6');//59 - 底层是数值相加
        //字符串的拼接：
        //规则：+左右两侧的任意一侧有字符串，那么这个加号就是字符串拼接的作用，结果一定是字符串
        int num = 56;
        System.out.println("num="+num);//"num=56" ---> num=56
        System.out.println(5+6+"7");//11+"7"--->"117"  --->117
        System.out.println(5+'6'+"7");//59 (6的ASCII码是54) +"7"--->"597" --->597
        System.out.println("5"+6+"7");//"56"+"7"  --->"567"--->567
        System.out.println("5"+'6'+"7");//"56"+"7"--->"567"--->567 (字符串+字符=字符串)
        System.out.println("5"+'6'+'7');//"56"+'7'--->"567"---567
    }
}
