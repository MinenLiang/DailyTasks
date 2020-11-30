package study.day07.demo02;

/*
注意事项： 匿名对象只能使用唯一的一次， 下次再用不得不再创建一个新对象。
使用建议：如果确定一个对象只需要使用唯一的一次， 就可以使用匿名对象
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName(); //我叫高圆圆
        System.out.println("=========");

        //匿名对象
        new Person().name = "赵天佑";
        new Person().showName(); // null
    }
}
