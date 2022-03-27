import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 20:38
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor10 {
    public static void main(String[] args) {
        /*
        实现一个功能：
       【1】请录入10个整数，当输入的数是666的时候，退出程序。-被迫退出 break;
       【2】判断其中录入正数的个数并输出。-count计数器
       【3】判断系统的退出状态：是正常退出还是被迫退出。-布尔类型
        */
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int count = 0;
        int num = 0;
        for (int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"个整数:");
            num = sc.nextInt();
            if (num>0){
                count++;
            }
            if (num==666){
                exit = true;
                break;
            }
        }
        System.out.println("录入的正数的个数:"+count);
        if (exit == false){
            System.out.println("该程序正常退出");
        }else {
            System.out.println("该程序被迫退出");
        }
    }
}
