/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 14:03
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe10 {
    public static void main(String[] args){
        int i=8;
        System.out.println((5>7)&&(i++==2)); //false
        System.out.println(i);  //8 第二个表达式就不计算


        int a=8;
        System.out.println((5>7)&(a++==2)); //false - a先比较后加一
        System.out.println(a); //9


        int m=8;
        System.out.println((5<7)&&(m++==2)); //false - m先比较后加一
        System.out.println(m); //9

        int b=2;
        System.out.println((5<7)&(b++==2)); //true - b先比较后加一
        System.out.println(b);  //3

        int c=2;
        System.out.println((5<7)&(++c==2)); //false - c会先加1
        System.out.println(c);  //3
    }
}
