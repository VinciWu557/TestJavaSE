/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/20 - 03 - 20 - 15:03
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestArray12 {
    public static void main(String[] args){
        //定义一个二维数组：
        int[][] arr = new int[3][];//本质上定义了一个一维数组，长度为3

        int[] a1 = {1,2,3};
        arr[0] = a1;

        arr[1] = new int[]{4,5,6,7};

        arr[2] = new int[]{9,10};
    }
}
