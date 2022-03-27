/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 14:13
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe11 {
    public static void main(String[] args){
        /*
         a?b:c - 条件运算符(三元/三目运算符)
        其中a是一个布尔类型的表达式，返回结果要么是true要么false，通过a的结果决定最终表达式的结果:
        如果a的结果是true，那么表达式最终结果为b
        如果a的结果是false，那么表达式最终结果为c
         */
        int num = (5>7)?6:9 ;
        System.out.println(num);//9

        String str = (4==4)?"你好":"你不好" ;
        System.out.println(str);//你好

        System.out.println((4==4)?"你好":"你不好");
    }
}
