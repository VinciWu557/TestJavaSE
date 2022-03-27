import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 20:10
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestMethod03 {
    public static void main(String[] args){
        //功能：我心里有一个数，你来猜，看是否猜对
        //1.你猜一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请你猜一个数：");
        int yourGuessNum = sc.nextInt();

        //调用猜数的方法：
        guessNum(yourGuessNum);
    }

    //方法的定义：功能：实现猜数功能：
    public static void guessNum(int yourNum){
        //我心里有一个数(1-6)
        //Math.random() - 取[0.0~1.0)区间的随机数
        int myHeartNum = (int)(Math.random()*6)+1;
        //将两个数比对：
        System.out.println(yourNum==myHeartNum?"猜对了":"猜错了");
        //已经打印出结果,不需要返回值了
    }
}
