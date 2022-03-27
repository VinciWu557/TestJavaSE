import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/20 - 03 - 20 - 9:49
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestArray03 {
    public static void main(String[] args){
        //功能：键盘录入十个学生的成绩，求和，求平均数：
        //定义一个int类型的数组，长度为10 ：
        int[] scores = new int[10];
        //定义一个求和的变量：
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){//i:控制循环次数
            System.out.print("请录入第"+i+"个学生的成绩：");
            int score = sc.nextInt();
            scores[i-1] = score;
            sum += score;
        }

        System.out.println("十个学生的成绩之和为："+sum);
        System.out.println("十个学生的成绩平均数为："+sum/10);


        //求第6个学生的成绩：
        //System.out.println(scores[5]);
                /*
                System.out.println(scores[0]);
                System.out.println(scores[1]);
                System.out.println(scores[2]);
                System.out.println(scores[3]);
                //....
                System.out.println(scores[9]);
                */
        //将数组中的每个元素进行查看--》数组的遍历：
        //方式1：普通for循环---》正向遍历：
        for(int i=0;i<=9;i++){
            System.out.println("第"+(i+1)+"个学生的成绩为："+scores[i]);
        }

        //方式2：增强for循环:
        //第一个定义一个变量，第二个是要遍历的数组
        //对scores数组进行遍历，遍历出来每个元素都用int类型的num接收：
        int count = 0;
        //定义计数器
        for(int num:scores){
            count++;
            //每次都将num在控制台输出
            System.out.println("第"+count+"个学生的成绩为："+num);
        }

                /*
                增强for循环：
                优点：代码简单
                缺点：单纯的增强for循环不能涉及跟索引相关的操作
                */

        //方式3：利用普通for循环： 逆向遍历：
        for(int i=9;i>=0;i--){
            System.out.println("第"+(i+1)+"个学生的成绩为："+scores[i]);
        }
    }
}
