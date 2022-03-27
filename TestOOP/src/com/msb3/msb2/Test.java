package com.msb3.msb2;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/12 - 03 - 12 - 20:11
 * @Description: com.msb2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /*
        1.一般保证空构造器的存在,空构造器中一般不会进行属性的赋值操作
        2.一般我们回重载构造器,在重载的构造器中进行属性赋值操作
        3.在重载构造器之后,假如空构造器忘记写了,系统不会给你分配空构造器.
        4.当形参名字和属性名字重名时,程序会采用就近原则
        因此在要表示对象的属性前面加上this来修饰,因为this代表的是你创建的对象
         */
        Person p = new Person();

        /*
        p.age = 19;
        p.name = "Lily";
        p.height = 164.5;
        */

        Person p2 = new Person("Lily",19,164.5);
        System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p2.height);


    }
}
