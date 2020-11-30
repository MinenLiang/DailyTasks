package study.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(7, 8);
        System.out.println("返回值是： " + num);
        System.out.println("==============");
        printSum(100,200);

    }

    //返回值int
    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }

    //没有返回值
    //对于void没有返回值的方法，只能单独，不能打印或者赋值
    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("结果是： " + result);
    }
}
