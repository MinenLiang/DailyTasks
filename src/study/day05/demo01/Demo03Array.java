package study.day05.demo01;
/*
使用建议：
如果不确定数组当中的内容，用动态初始化，否则，已经确定了具体的内容，用静态初始化。
* */
public class Demo03Array {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int[] arrayA = {10,20,30};

        //静态初始化的标准格式，可以拆分成为两个步骤
        int[] arrayB;
        arrayB = new int[]{11,21,31};

        //动态初始化也可以拆分成两个步骤
        int[] arrayC;
        arrayC = new int[5];
    }
}
