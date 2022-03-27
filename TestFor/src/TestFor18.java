/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 17:06
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor18 {
    public static void main(String[] args) {
        /*
        空心棱形
        *
       * *
      *   *
       * *
        *
         */

        for (int i=1;i<=3;i++){//控制行数
            for(int j=1;j<=5;j++){
                if (((j==((5/2+1)+i-1)))||((j==((5/2+1)-i+1)))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int k=2;k>=1;k--){
            for (int m=1;m<=5;m++){
                if (((m==((5/2+1)+k-1)))||((m==((5/2+1)-k+1)))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //打印上三角
        for (int i=1; i<=4; i++) {//打印行数
            for (int j = 1; j <= 9 - i; j++) {//打印空格的数量
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//打印星星的数量
                if (j==1||j==(2*i-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();//换行
        }
        //打印下三角
        /*
      *   *
       * *
        *
        i=3 6个空格 首尾是星
        i=2 7个空格 首尾是星
        i=1 8个空格 首尾是星
        *
         */
        for (int i=3;i>=1;i--){
            for (int j=1;j<=9-i;j++){//打印空格的数量
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){//打印星星的数量
                if (j==1||j==(2*i-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();//换行
        }
    }
}
