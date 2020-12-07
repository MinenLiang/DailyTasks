package study.day09.demo13;

//子类也是一个抽象类
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

//    @Override
//    public void sleep() {
//        System.out.println("睡觉觉");
//    }
}
