package study.day10.demo01;
/*
* 备注： 接口当中的默认方法，可以解决接口升级的问题
* */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    //新添加的方法
//    public abstract void methodAbs2();

    //新添加的方，改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }

}
