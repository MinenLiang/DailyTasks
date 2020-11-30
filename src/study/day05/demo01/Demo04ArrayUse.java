package study.day05.demo01;
/*
【注意】索引值从0开始，一直到“数组的长度-1”为止
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10,20,30};
        System.out.println(array);//[I@1540e19d
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println("================");

        //访问数组之间的任何一个元素， 然后给予赋值变量
        int num = array[1];
        System.out.println(num);//20
    }
}
