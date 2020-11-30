package study.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(5,6);
        System.out.println("=====");

        //打印调用
        System.out.println(sum(5,6)); //11
        System.out.println("=====");

        //赋值调用
        int number = sum(4,5); //9
        number += 100; // 100+9
        System.out.println("变量的值: " + number);
    }
    public static int sum(int a, int b){
        System.out.println("方法执行啦");
        int result = a + b;
        return result;
    }
}
