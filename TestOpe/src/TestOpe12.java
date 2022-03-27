import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 14:14
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestOpe12 {
    public static void main(String[] args) {
        //实现功能：男孩女孩选择晚饭吃什么，如果意见一致，听男生的，如果意见不一致，听女生的
        //1.男生选择晚饭吃什么
        Scanner sc = new Scanner(System.in);
        System.out.println("男生晚饭想吃:");
        String boy = sc.next();

        //2.女生选择晚饭吃什么
        System.out.println("女生晚饭想吃:");
        String girl = sc.next();

        //3.判断男女生的意见
        System.out.println(((boy.equals(girl))?(boy):(girl)));

    }
}
