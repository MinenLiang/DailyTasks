package study.day05.demo03;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 50, 100, 101};
        int min =  array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值 ：" + min);
    }
}
