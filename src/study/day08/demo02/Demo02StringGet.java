package study.day08.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        //字符串的长度
        int length = "alkshdguyennsziudfb".length();
        System.out.println("字符串的长度是： " + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello 原封不动
        System.out.println(str2);//World 原封不动
        System.out.println(str3);//HelloWorld 新的字符串
        System.out.println("===============");

        //获取指定索引位置的单个字符
        char c = "Hello".charAt(1);
        System.out.println("在一号索引位置的字符是： " + c);
        System.out.println("==============");

        //查找参数字符串在本来字符串当中已出现的第一次索引位置
        //如果根本没有， 返回-1值
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是： " + index); //2

        System.out.println("HelloWorld".indexOf("abc")); //-1


    }
}
