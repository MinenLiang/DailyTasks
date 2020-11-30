package study.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        printArray(array);//传递进去的就是array当中的地址值
        System.out.println("AAA");
        printArray(array);
        System.out.println("BBB");
        printArray(array);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
