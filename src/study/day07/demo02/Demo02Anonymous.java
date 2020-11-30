package study.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {

//        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("Number entered：" + num);

//        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodPara(sc);

//        //使用匿名对象来进行传参
//        methodPara(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static void methodPara(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是: " + num);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
