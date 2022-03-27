import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 17:33
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestSwitch {
    public static void main(String[] args) {
        /*
                实现一个功能：
                根据给出的学生分数，判断学生的等级：
                >=90  -----A
                >=80  -----B
                >=70  -----C
                >=60  -----D
                <60   -----E
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的分数:");
        int score = sc.nextInt();
        switch (score/10){
            case 10:
            case 9:
                System.out.println("学生的等级为:A");break;
            case 8:
                System.out.println("学生的等级为:B");break;
            case 7:
                System.out.println("学生的等级为:C");break;
            case 6:
                System.out.println("学生的等级为:D");break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("学生的等级为:E");break;

            /*
            【1】语法结构：
            switch(){
                    case * :
                    case * :
                    .......
            }
            【2】switch后面是一个()，()中表达式返回的结果是一个等值，这个等值的类型可以为：
            int,byte,short,char,String,枚举类型
            【3】这个()中的等值会依次跟case后面的值进行比较，如果匹配成功，就执行:后面的代码
            【4】为了防止代码的“穿透”效果：在每个分支后面加上一个关键词break，遇到break这个分支就结束了
            【5】类似else的“兜底”“备胎”的分支：default分支
            【6】default分支可以写在任意的位置上，但是如果没有在最后一行，后面必须加上break关键字，
            如果在最后一行的话，break可以省略
            【7】相邻分支逻辑是一样的，那么就可以只保留最后一个分支，上面的都可以省去不写了
            【8】switch分支和if分支区别：
            表达式是等值判断的话--》if ，switch都可以
            如果表达式是区间判断的情况---》if最好
            【9】switch应用场合：就是等值判断，等值的情况比较少的情况下
            */
        }

    }
}
