import java.util.Arrays;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/20 - 03 - 20 - 15:00
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestArray11 {
    public static void main(String[] args){
        //给一个源数组：
        int[] srcArr = {11,22,33,44,55,66,77,88};
        //给一个目标数组：
        int[] destArr = new int[10];

        //复制：
        System.arraycopy(srcArr,1,destArr,3,3);
        //遍历查看目标数组：
        System.out.println(Arrays.toString(destArr));
    }
}
