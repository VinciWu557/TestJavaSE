/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 20:04
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestMethod02 {
    public static void add(int num1,int num2){
        int sum = 0;
        sum += num1;
        sum += num2;
        System.out.println(sum);
        //return;
    }

    public static void main(String[] args){
        //10+20:
        //方法的调用：（用方法）
        add(10,20);
        //30+90:
        add(30,90);
        //50+48:
        //System.out.println(add(50,48));
        // 报错：TestMethod02.java:22: 错误: 此处不允许使用 '空' 类型方法 - add方法返回值为空
    }
}
