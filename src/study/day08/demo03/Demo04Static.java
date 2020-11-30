package study.day08.demo03;
/*
* 特点，当第一次用到本类时，静态代码块执行唯一的一次
* */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
