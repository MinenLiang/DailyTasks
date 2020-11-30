package study.day09.demo04;
/*
* 重写(Override)： 方法的名称一样，参数列表也一样。
* 重载(Overload)： 方法的名称一样，参数列表不一样。
* */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //创建的是new了子类对象，所以优先用子类方法
        zi.method();
    }
}
