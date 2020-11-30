package study.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Please enter number 3: ");
        int num3 = sc.nextInt();

        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        System.out.println("Max is " + max);



    }
}

