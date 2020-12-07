package study.day10.demo03;
/*
* 这个子接口当中有几个方法？ 答：4个。
* methodA, methodB, methodCommon, method
* */

public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
