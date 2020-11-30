package study.day08.demo02;

public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=================");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=================");

        //字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "会不会玩儿啊！ 你大爷的！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2);


    }
}
