/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 18:01
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor19 {
    public static void main(String[] args){
        //先打印出一个正方形，然后某些位置上打印* 某些位置上打印空格：
        int size = 17;//行数
        int startNum = size/2+1;//起始列号,局部变量必须初始化
        int endNum = size/2+1;//结束列号
        //引入一个布尔类型的变量---》理解为“开关” 判断棱形上下半侧
        boolean flag = true;
        for(int j=1;j<=size;j++){
            //*****
            for(int i=1;i<=size;i++){
                if(i>=startNum&&i<=endNum){//从开始点到结束点之间打印星号
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //换行
            System.out.println();
            if(endNum==size){
                flag = false;
            }

            if(flag){//flag是true相当于在菱形的上半侧
                //flag是false相当于在菱形的下半侧
                startNum--;//上半侧:起始点每行循环完成后向左移1位
                endNum++;//上半侧:结束点每行循环完成后向右移1位
            }else{
                startNum++;//上半侧:起始点每行循环完成后向右移1位
                endNum--;//上半侧:结束点每行循环完成后向左移1位
            }
        }
    }
}
