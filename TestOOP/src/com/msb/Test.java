package com.msb;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/12 - 03 - 12 - 17:33
 * @Description: com.msb
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个人类的具体的对象/实例:
        //创建一个对象,对象名字为:zs
        //Person 属于 引用数据类型
        //第一次加载类, 会进行类的加载, 初始化创建对象的时候, 对象的属性没有赋值, 有默认的初始值
        Person zs = new Person();
        zs.name = "张三";
        zs.age = 19;
        zs.height = 180.4;
        zs.weight = 170.4;

        //再创建一个对象:
        //第二次加载类,不会进行类的加载
        Person ls = new Person();
        ls.name = "李四";
        ls.age = 18;
        ls.height = 170.6;
        ls.weight = 100;

        //对属性值进行读取:
        System.out.println(zs.name);
        System.out.println(ls.age);

        //对方法进行操作
        //不同的对象,属性有自己特有的值,但是方法都是调用类中通用的方法
        //属性:各个对象的属性是独立的
        //方法:各个对象的方法是共享的
        zs.eat();
        ls.eat();
        zs.sleep("教室");
        String str = zs.introduce();
        System.out.println(str);
    }
}
