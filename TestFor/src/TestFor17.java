/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 16:12
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor17 {
    public static void main(String[] args) {
/*
打印棱形
  *
 ***
*****
 ***
  *

*/
        //1.打印上三角
        /*
          *
         ***
        *****
        */
        for (int i=1;i<=3;i++){//控制行数
            for(int j=1;j<=5;j++){
                if (((j<=((5/2+1)+i-1)))&&((j>=((5/2+1)-i+1)))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //2.打印下三角
        /*
         ***
          *
        */
        for (int k=2;k>=1;k--){
            for (int m=1;m<=5;m++){
                if (((m<=((5/2+1)+k-1)))&&((m>=((5/2+1)-k+1)))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //msb
        for(int j=1;j<=4;j++){//j:控制行数
            //加入空格：
            for(int i=1;i<=(9-j);i++){//i:控制空格的个数
                System.out.print(" ");
            }
            //*********
            for(int i=1;i<=(2*j-1);i++){//i:控制*的个数
                System.out.print("*");
            }
            //换行：
            System.out.println();
        }

        //下面三角形：
        for(int j=1;j<=3;j++){//j:控制行数
            //加入空格：
            for(int i=1;i<=(j+5);i++){//i:控制空格的个数
                System.out.print(" ");
            }
            //*********
            for(int i=1;i<=(7-2*j);i++){//i:控制*的个数
                System.out.print("*");
            }
            //换行：
            System.out.println();
        }
    }
}
