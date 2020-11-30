package study.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Melvin");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Male? " + stu.isMale());
    }
}
