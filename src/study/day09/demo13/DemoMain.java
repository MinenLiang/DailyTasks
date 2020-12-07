package study.day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
        //    Animal animal = new Animal(); //错误！
        //    Dog dog = new Dog(); //错误,这也是抽象类
        Hasky ha = new Hasky();
        ha.eat();
        ha.sleep();
        System.out.println("==========");

        GoldenRetriever golden = new GoldenRetriever();
        golden.eat();
        golden.sleep();
    }
}
