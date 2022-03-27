/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 11:50
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor15 {
    /*
    打印平行四边形
       *********
      *********
     *********
    *********

    i=1 j=0 1 2 3
    i=2 j=0 1 2
    i=3 j=0 1
    i=4 j=0
    */
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=9;k++){
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
