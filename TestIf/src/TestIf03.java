import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 16:03
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestIf03 {
    public static void main(String[] args) {
        //1.输入会员积分,并判断录入数据是否为int类型
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的会员积分:");
        if (sc.hasNextInt()==true) {
            int score = sc.nextInt();
            if (score < 0) {
                System.out.println("您输入的会员积分不是正数,请重新输入!");
        //2.判断相应的折扣
            } else if (score >= 8000) {
                    System.out.println("该会员享受的折扣是:0.6");
                } else if ((score >= 4000) && (score < 8000)) {
                    System.out.println("该会员享受的折扣是:0.7");
                } else if ((score >= 2000) && (score < 4000)) {
                    System.out.println("该会员享受的折扣是:0.8");
                } else {
                    System.out.println("该会员享受的折扣是:0.9");
                }
        }else{
            System.out.println("您输入的会员积分不是整数,请重新输入!");
        }
    }
}
