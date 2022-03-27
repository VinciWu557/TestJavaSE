/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 12:26
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor16 {
    public static void main(String[] args) {
        //打印三角形
    /*
       *
      ***
     *****
    *******

    i=1
     =1 2 3 5 6 7
    *=4
    4=(7/2+1)+1-1
     =(7/2+1)-1+1

    i=2
     =1 2 6 7
    *=3 4 5
    5=(7/2+1)+2-1
    3=(7/2+1)-2+1

    i=3
     =1 7
    *=2 3 4 5 6
    6=(7/2+1)+3-1
    2=(7/2+1)-3+1

    */
        for(int i=1;i<=4;i++){
            for (int j=1;j<=7;j++){
                if ((j<=((7/2+1)+i-1))&&(j>=((7/2+1)-i+1))){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //msb
        for(int j=1;j<=4;j++) {//j:控制行数
            //加入空格：
            for (int i = 1; i <= (9 - j); i++) {//i:控制空格的个数
                System.out.print(" ");
            }
            //*********
            for (int i = 1; i <= (2 * j - 1); i++) {//i:控制*的个数
                System.out.print("*");
            }
            //换行：
            System.out.println();
        }
    }
}
