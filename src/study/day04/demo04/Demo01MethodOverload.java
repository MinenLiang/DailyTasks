package study.day04.demo04;
/*
方法的重载（overload）
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(3,8));//11
        System.out.println(sumThree(2,8,7));//17
        System.out.println(sumFour(3,4,5,6));//18*/

        System.out.println(sum(10.0,20)); //两个参数
        System.out.println(sum(10,20,30));//三个参数
        System.out.println(sum(10,20,40,50));//四个参数
    }

    public static int sum(double a, int b){
        return (int)(a + b);
    }
    public static int sum(int a, double b){
        return (int)(a + b);
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

}
