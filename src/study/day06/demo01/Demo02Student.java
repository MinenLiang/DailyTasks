package study.day06.demo01;
/*
1.导包，
import 包名称，类名称
import study.day06.demo01.Student;
对于和当前属于同一个包的情况，可以省略导包语句不写。

2. 创建，格式
类名称 对象名 = new 类名称();
Student stu = new Student();

3.使用，分为两种情况
使用成员变量： 对象名.成员变量名
使用成员方法：对象名.成员方法()

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
* */

public class Demo02Student {
    public static void main(String[] args) {
        //根据Student类, 创建了一个stu的对象
        Student stu = new Student();
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("============");

        //改变对象当中的成员变量数值内容
        stu.name = "Joe";
        stu.age = 21;
        System.out.println(stu.name);//Joe
        System.out.println(stu.age);//21
        System.out.println("============");

        //使用对象的成员方法，格式
        stu.eat();
        stu.sleep();
        stu.study();
    }


}
