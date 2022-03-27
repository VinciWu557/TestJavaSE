import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 17:09
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestIf05 {
    public static void main(String[] args) {
        /*
        练习：
        小朋友搬桌子：
        年龄大于7岁，可以搬桌子；
        如果年龄大于5岁，性别是男，可以搬桌子；
        否则不可以搬动桌子，提示：你还太小了
         */

        //1.输入小朋友的年龄并判断
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小朋友的年龄:");
        int age = sc.nextInt();
        if (age<=0) {
            System.out.println("您输入的年龄有误,请重新输入!");
            return;
        }

        //2.输入小朋友的性别并判断
        System.out.println("请输入小朋友的性别:");
        String sex = sc.next();
        if (((sex.equals("男"))||(sex.equals("女")))==false){
            System.out.println("您输入的性别有误,请重新输入!");
            return;
        }

        //3.验证年龄与性别无误后进行判断
        if (age>0){
            if (age>7){
                System.out.println("该小朋友可以搬桌子.");
            }else if ((age>5)&&(sex.equals("男"))){
                System.out.println("该小朋友可以搬桌子.");
            }else{
                System.out.println("你还太小了,不能搬桌子!");
            }
        }
    }
}
