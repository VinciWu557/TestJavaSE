/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 19:55
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor03 {
    public static void main(String[] args){
        //break的作用：停止最近的循环 (if属于分支结构,不属于循环结构)
        /*
        for(int i=1;i<=100;i++){
                System.out.println(i);
                if(i==36){
                        break;//1-36
                }
        }
        */
        for(int i=1;i<=100;i++){
            System.out.println(i);
            while(i==36){
                break; //1-100  ---》break停止的是while循环，而不是外面的for循环
            }
        }
    }
}
