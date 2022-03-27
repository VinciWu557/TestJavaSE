/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 20:25
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor08 {
    public static void main(String[] args){
        //return:遇到return结束当前正在执行的方法-在这个类中,直接结束main方法
        for(int i=1;i<=100;i++){
            while(i==36){
                return;
            }
            System.out.println(i);
        }
        System.out.println("-----");
    }
}
