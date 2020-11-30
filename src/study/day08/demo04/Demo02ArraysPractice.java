package study.day08.demo04;

import java.util.Arrays;

public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str = "askjdghiuwhtmbg0";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //倒序，chars.forr快捷方式
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
