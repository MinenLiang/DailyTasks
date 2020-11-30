package study.day07.demo05;

import java.util.ArrayList;

/*
* 题目：
* 自定义4个学生对象，添加到集合，并遍历
* */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("Joe", 21);
        Student two = new Student("Joey", 22);
        Student three = new Student("Jay", 23);
        Student four = new Student("Jacob", 24);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("Name: " + stu.getName() + " Age: " + stu.getAge());
        }
    }
}
