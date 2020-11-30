package study.day05.demo03;

public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null; //代表里面什么都没有
//        array = new int[3];
        System.out.println(array[0]);//空指针异常 NullPointerException 解决方法补上new
    }
}
