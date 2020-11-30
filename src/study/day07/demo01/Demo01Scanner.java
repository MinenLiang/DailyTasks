package study.day07.demo01;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("Entered number: " + num);

        //获取键盘输入的字符串
        String str = sc.next();
        System.out.println("Entered word: " + str);
    }
}
