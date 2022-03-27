/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/17 - 03 - 17 - 15:48
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestVar04 {

    //成员变量:定义在类中,方法外
    int b =20;

    public static void main(String[] args) {
        //System.out.println(a);//未定义a
        int a =10; //局部变量:定义在方法中
        System.out.println(a);
        TestVar04 t = new TestVar04();
        //System.out.println(b);

        /*
        no,因为main方法是static的，不属于TestVar04类，如果在main方法内部调用b,
        而b是每一个TestVar04实例都有的变量，那main中应该去哪一个实例的name呢?
        解决方法:
        TestVar04 t = new TestVar04();
        System.out.println(t.b);
        */


        {
            int c =40;
            System.out.println(c);
            //int a =50;//变量不允许重复定义
        }
        //System.out.println(c);//超出c的作用域
    }

    public void eat(){
        System.out.println(b);
        //System.out.println(a);//未定义a
        int a = 30; //局部变量:定义在方法中
        System.out.println(a);
    }
}
