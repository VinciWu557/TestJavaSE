/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 20:20
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor07 {
    public static void main(String[] args){
        outer:
        for(int i=1;i<=100;i++){
            while(i==36){
                continue outer;  //1-100没有36-当i=36时,结束此次for循环,没有输出i=36
            }
            System.out.println(i);
        }
    }
}
