/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 11:40
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor13 {
    public static void main(String[] args) {
        /*打印长方形
        *********
        *********
        *********
        *********
        */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=9;j++){
                System.out.print("*");
                if (j==9){
                    System.out.println();
                }
            }
        }
    }
}
