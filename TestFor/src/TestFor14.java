/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 11:40
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor14 {
    public static void main(String[] args) {
        /*打印前面有4个空格的长方形
            *********
            *********
            *********
            *********
        */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++) {
                System.out.print(" ");
            }

            for (int k=1;k<=9;k++){
                System.out.print("*");
                if (k==9){
                    System.out.println();
                }
            }
        }
    }
}
