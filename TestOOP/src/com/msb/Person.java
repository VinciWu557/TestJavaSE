package com.msb;

import javax.lang.model.element.NestingKind;

/**
 * @Auther: Vinci Wu
 * @Date: 2022/3/12 - 03 - 12 - 17:08
 * @Description: com.msb
 * @version: 1.0
 * 创建类:人
 */
public class Person {
    //名词 -- >> 属性(注意:只把有需要的内容写在代码中,不相干的不要放在代码中)
    //属性 -- >> 成员变量: 放在类中,方法外
    int age ;//年龄
    String name ;//姓名
    double height ;//身高
    double weight ;//体重


    //动词 -- >> 方法
    //吃饭:
    public void eat(){
        int num = 10;//局部变量:放在方法中,必须初始化
        System.out.println("我喜欢干饭!");
    }

    //睡觉:
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }

    //自我介绍:
    public String introduce(){
        return "我的名字是:"+name+",我的年龄是"+age+",我的身高是:"+height+",我的体重是"+weight;
    }

}
