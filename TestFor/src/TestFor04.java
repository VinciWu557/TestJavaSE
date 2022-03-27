/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 20:05
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor04 {
    public static void main(String[] args){
        outer:     //----》定义标签结束的位置
        for(int i=1;i<=100;i++){
            System.out.println(i);
            while(i==36){
                break outer;    //----》根据标签来结束循环
            }
        }
    }
}
