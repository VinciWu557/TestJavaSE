/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/19 - 03 - 19 - 18:02
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFor21 {

    public static void main(String[] args){
        //二重循环可以帮我们解决：二元一次方程组的问题：
        for(int a=1;a<=5;a++){
            for(int b=3;b<=6;b++){
                if(a+b==7){
                    System.out.println(a+"----"+b);
                }
            }
        }

        //三重循环可以帮我们解决：三元一次方程组的问题：
        /*
        百钱买百鸡：
        公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，
        用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有
        问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
        数学：
        设未知数：
        公鸡：x只
        母鸡：y只
        小鸡：z只
        x+y+z=100只
        5x+3y+z/3=100钱
        麻烦方式：
        for(int x=1;x<=100;x++){
                for(int y=1;y<=100;y++){
                        for(int z=1;z<=100;z++){
                                if((x+y+z==100)&&(5*x+3*y+z/3==100)&&(z%3==0)){
                                        System.out.println(x+"\t"+y+"\t"+z);
                                }
                        }
                }
        }
        */
        //优化：考虑到实际能够购买鸡的数量
        for(int x=1;x<=19;x++){
            for(int y=1;y<=31;y++){
                int z = 100-x-y;
                if((5*x+3*y+z/3==100)&&(z%3==0)){
                    System.out.println(x+"\t"+y+"\t"+z);
                }
            }
        }
    }
}
