package study.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(6);
    }
    //我来决定打印多少次
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello!" + (i + 1));
        }
    }
}
