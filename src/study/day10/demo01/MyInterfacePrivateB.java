package study.day10.demo01;

public interface MyInterfacePrivateB {
    public default void methodStatic1(){
        System.out.println("静态方法方法1！");
        methodStaticCommon();
    }

    public static void methodStatic2(){
        System.out.println("静态方法2！");
        methodStaticCommon();
    }
    public static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
