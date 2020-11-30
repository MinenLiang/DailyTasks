package study.day07.demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        printArrayList(list);
    }
    /*
    * 定义方法的三要素：
    * 返回值类型：只是打印而已，没有运算，没有结果， 所以用void
    * 方法名称：printArrayList
    * 参数列表：ArrayList
    * */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size()-1) {
                System.out.println(name + "}");
            }else{
                System.out.print(name + "@");
            System.out.print("@");
            }
        }
    }
}
