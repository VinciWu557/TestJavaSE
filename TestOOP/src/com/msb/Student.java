package com.msb;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/12 - 03 - 12 - 19:49
 * @Description: com.msb
 * @version: 1.0
 */
public class Student {
    byte e;
    short s;
    long num2;
    float f;
    double d;
    char ch;
    boolean bo;
    String name;
    int c ;//成员变量:在类中方法外
    public void study(){
        int num = 10;//局部变量:在方法中,需要赋初始值
        //int num;不能重复命名
        {
            int a;//局部变量:在代码块中
        }
        if (1==3){
            int b;
        }
        System.out.println(c);
    }

    public void eat(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
        System.out.println(s.bo);
        System.out.println(s.ch);
        System.out.println(s.d);
        System.out.println(s.e);
        System.out.println(s.f);
        System.out.println(s.name);
        System.out.println(s.num2);
        System.out.println(s.s);
    }

}
