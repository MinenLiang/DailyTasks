package study.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("=============");
        Student student2 = new Student("Joe", 21);
        student2.setAge(22);
        System.out.println("Name is " + student2.getName() + ", Age is " + student2.getAge());

    }
}
