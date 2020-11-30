package study.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //里面装的全是String字符串类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Hello");
        System.out.println(list);

        list.add("Hi");
        list.add("yo");
        list.add("hey");
        System.out.println(list);
    }
}
