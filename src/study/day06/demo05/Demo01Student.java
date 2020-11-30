package study.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Melvin");
        student.setAge(22);
        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        System.out.println("============");

        Student student2 = new Student("Cai", 20);
        System.out.println("Name: " + student2.getName() + ", Age: " + student2.getAge());
        student2.setAge(23);
        System.out.println("Name: " + student2.getName() + ", Age: " + student2.getAge());
    }
}
