/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 19:03
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestWhile {
    public static void main(String[] args){
        //功能：1+2+3+4+5
        //初始化谁，就判断谁，判断谁，就迭代谁
        //1.定义变量：
        int num = 1;//[1]条件初始化
        //2.定义一个求和变量，用来接收和：
        int sum = 0;
        while(num<=5){//[2]条件判断
            sum += num;//[3]循环体
            num++;//[4]迭代
        }
        //3.输出和
        System.out.println(sum);
    }
}
