/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/20 - 03 - 20 - 9:58
 * @Description: 最值问题
 * @version: 1.0
 */
public class TestArray04 {
    //实现一个功能：给定一个数组int[] arr = {12,3,7,4,8,125,9,45}; ，求出数组中最大的数。
    public static void main(String[] args) {
        //1.给定一个数组
        int arr[] = {12,3,7,4,8,125,9,45};
        //2.调用输出数组中最大的函数
        System.out.print("数组中最大的数是:"+getMax(arr));
    }

    public static int getMax(int arr[]){
        int max = arr[0];
        for (int i=0; i< arr.length;i++){
            if (max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
