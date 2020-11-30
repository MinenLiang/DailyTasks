package study.day07.demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //本来范围是[0,n), 整体+1之后变成了[1, n+1], 也就是[1,n]
            int num = r.nextInt(n)+1;
            System.out.println(num);
        }

    }
}
