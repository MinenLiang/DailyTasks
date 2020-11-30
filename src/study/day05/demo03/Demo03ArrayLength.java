package study.day05.demo03;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {1,2,3,4,5,6,6,7,9};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
        System.out.println("==============================");

        //数组一旦创建，程序运行期间，长度不可改变
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
