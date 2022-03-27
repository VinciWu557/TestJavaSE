import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/20 - 03 - 20 - 12:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestArray06 {
    public static void main(String[] args) {
        //功能：给定一个数组,在数组下标为2的位置上添加一个元素91
        //1.给定一个数组：
        int[] arr = {12,34,56,7,3,10};
        //           0  1  2  3 4 5
        //2.输出在添加元素前的数组
        System.out.println("添加元素前的数组:"+ Arrays.toString(arr));

        //3.输入需要添加的元素的位置与数值
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你添加元素的位置:");
        int index = sc.nextInt();
        System.out.print("请输入你添加元素的数值:");
        int num = sc.nextInt();

        //4.进行元素的添加
        /*
        0和1不变,从下标2后arr[3]=arr[2]>>arr[4]=arr[3]...arr[5]=arr[4]
         */
        for (int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index] = num;

        //5.输出添加元素后的数组
        System.out.println("添加元素后的数组:"+ Arrays.toString(arr));
    }
}