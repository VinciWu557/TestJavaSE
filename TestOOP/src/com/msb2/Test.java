package com.msb2;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/12 - 03 - 12 - 20:11
 * @Description: com.msb2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个Person类的具体的对象/实例/实体
        /*
        创建对象的过程:
        1. 第一次遇到Person的时候,进行类的加载(只加载一次)
        2. 创建对象,为这个对象在堆中开辟空间
        3. 为对象进行属性的初始化工作

        new关键字实际上是在调用一个方法,这个方法叫做构造方法(构造器)
        调用构造器时,如果你的类中没有写构造器,那么系统回默认给你分配一个构造器
        可以自己显式的将构造器编写出来:
        构造器的狗屎:
        [修饰符] 构造器的名字(){

        }

        构造器与方法的区别:
        1.没有方法的返回值类型
        2.方法体内部不能有return语句
        3.构造器的名字很特殊,必须跟类名一样

        构造器的作用:
        不是为了创建对象,因为在调用构造器之前,这个对象就已经创建好了,且属性有默认的初始值.
        构造器的目的是给属性进行赋值操作的.

        注意:
        我们不会在空构造器中进行初始化操作,否则每个对象的属性都会一样
        实际上,我们只需要保证空构造器的存在
        */

        Person p = new Person();
        //左侧接受右侧创建的对象
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.height);

        Person p2 = new Person();
        System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p2.height);


    }
}
