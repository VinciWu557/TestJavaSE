/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 18:01
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor20 {
    public static void main(String[] args){
        //先打印出一个正方形，然后某些位置上打印* 某些位置上打印空格：
        int size = 17;
        int startNum = size/2+1;//起始列号
        int endNum = size/2+1;//结束列号
        //引入一个布尔类型的变量---》理解为“开关”
        boolean flag = true;
        for(int j=1;j<=size;j++){
            //*****
            for(int i=1;i<=size;i++){
                if(i==startNum||i==endNum){//仅在首尾两端打印星号
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //换行
            System.out.println();
            if(endNum==size){//判断是否到了最多星星的那一行
                flag = false;
            }

            if(flag){//flag是true相当于在菱形的上半侧
                //flag是false相当于在菱形的下半侧
                startNum--;
                endNum++;
            }else{
                startNum++;
                endNum--;
            }
        }
    }
}
