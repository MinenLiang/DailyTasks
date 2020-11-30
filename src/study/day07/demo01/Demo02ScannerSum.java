package study.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

    }
}
