/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 20:10
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor06 {
    public static void main(String[] args){
        //continue:结束本次离它近的循环，继续下一次循环
        /*
        for(int i=1;i<=100;i++){
                if(i==36){
                        continue;//1-100中间没有36--这个continue控制for循环
                              //当i=36时,结束for循环,不输出i,之后又继续开始执行for循环
                }
                System.out.println(i);
        }
        */

        for(int i=1;i<=100;i++){
            while(i==36){
                System.out.println("------");
                continue;
                //1-35+死循环--这个continue控制while循环而不是for循环
                //当i=36时,结束while循环,之后又继续执行while循环
            }
            System.out.println(i);
        }
    }
}
