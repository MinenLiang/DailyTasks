package study.day09.demo10;

public class Zi extends Fu{
    int num = 25;

    @Override
    public void method(){
        super.method();//调用父类方法
        System.out.println("子类方法");
    }

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
