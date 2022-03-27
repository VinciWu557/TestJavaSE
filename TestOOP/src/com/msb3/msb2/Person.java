package com.msb3.msb2;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/12 - 03 - 12 - 20:10
 * @Description: com.msb2
 * @version: 1.0
 */
public class Person {
    //属性:
    String name;
    int age;
    double height;

    //空构造器
    public Person(){
    }

    public Person(String name,int age,double height){
        //当形参名字和属性名字重名时,程序会采用就近原则
        //在要表示对象的属性前面加上this来修饰,因为this代表的是你创建的对象
        this.name= name;
        this.age= age;
        this.height= height;
    }

    //方法:
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
