package study.day08.demo01;
/*
* 创建字符串的常见3+1种方式，
* 三种构造方法：
* public String(): 创建一个空白字符串，不含有任何内容。
* public String(char[] array): 根据字符数据的内容，来创建对应的字符串。
* public String(byte[] byte): 根据字符数据的内容，来创建对应的字符串。
*
* 一种直接创建：
* String str = "Hello";
* */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串： " + str1);

        //根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串： " + str2);

        //根据字符数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串： " + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println(str4);
    }
}
