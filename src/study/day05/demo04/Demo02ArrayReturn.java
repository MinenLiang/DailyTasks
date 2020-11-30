package study.day05.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("Sum: " + result[0]);
        System.out.println("Avg: " + result[1]);
    }
    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        /*int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;*/
        int[] array = {sum, avg};
        return array;
    }
}
