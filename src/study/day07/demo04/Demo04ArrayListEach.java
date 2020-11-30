package study.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Joe");
        list.add("Join");
        list.add("Joseph");
        //遍历集合
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
