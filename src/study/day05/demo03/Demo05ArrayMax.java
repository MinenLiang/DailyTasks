package study.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 50, 100, 101};
        int max =  array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值 ：" + max);
    }
}
