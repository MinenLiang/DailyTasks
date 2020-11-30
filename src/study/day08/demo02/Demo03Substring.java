package study.day08.demo02;

public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2); //World
        System.out.println("========");

        String str3 = str1.substring(4,7); //oWo
        System.out.println(str3);
        System.out.println("========");

        //下面这种写法，字符串的内容仍然没有改变的
        //下面有两个字符串： "Hello", "Java"
        //strA当中保存的是地址值
        //本来地址值Hello的0x666
        //后来地址值变成了Java的0x999
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);

    }
}
