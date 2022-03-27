/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/18 - 03 - 18 - 19:06
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestWhile02 {
    /*
    【1】1+2+3+4+5+。。。。+100
    【2】2+4+6+8+。。。。+998+1000
    【3】5+10+15+20+。。。+100
    【4】99+97+95+。。5+3+1
    【5】1*3*5*7*9*11*13
     */
    public static void main(String[] args) {
        //[1]1+2+3+4+5+。。。。+100
        int num1 = 1;
        int sum1 = 0;
        while (num1<=100){
            sum1+=num1;
            num1++;
        }
        System.out.println(sum1);

        //[2]2+4+6+8+。。。。+998+1000
        int num2 = 2;
        int sum2 = 0;
        while (num2<=1000){
            sum2+=num2;
            num2=num2+2;
        }
        System.out.println(sum2);

        //[3]5+10+15+20+。。。+100
        int num3 = 5;
        int sum3 = 0;
        while (num3<=100){
            sum3+=num3;
            num3=num3+5;
        }
        System.out.println(sum3);

        //[4]99+97+95+。。5+3+1
        int num4 = 99;
        int sum4 = 0;
        while (num4>=1){
            sum4+=num4;
            num4=num4-2;
        }
        System.out.println(sum4);

        //[5]1*3*5*7*9*11*13
        int num5 = 1;
        int sum5 = 1;
        while (num5<=13){
            sum5*=num5;
            num5=num5+2;
        }
        System.out.println(sum5);
    }
}
