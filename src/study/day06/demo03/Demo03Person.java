package study.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "Joe";
//        person.age = 20;
        person.setAge(20);
        person.show();

    }
}
