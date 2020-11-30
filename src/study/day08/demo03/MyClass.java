package study.day08.demo03;

public class MyClass {
    int num;
    static int numStatic;

    //成员方法
    public void method(){
        System.out.println("这是一个成员方法。");
        System.out.println(num);
        System.out.println(numStatic);
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        System.out.println(numStatic);
        //静态不能直接访问非静态
        //System.out.println(num); //错误写法

        //静态方法中不能使用this关键字
//        System.out.println(this);//错误写法

    }
}
