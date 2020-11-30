package study.day08.demo04;
/*
* 计算在-10.8到5.9之间， 绝对值大于6或者小于2.1的整数有多少个？
* */
public class Demo04MathPractice {
    public static void main(String[] args) {
        int count = 0; //符合要求的整数

        //1.强转方法(int)
        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间之间内的所有的整数
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i); //绝对数
            //从绝对值里面筛选数字
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有： " + count);

        //2. Math.ceil方法
        /*double min = Math.ceil(-10.8);
        double max = Math.ceil(5.9);
        //这样处理，变量i就是区间之间内的所有的整数
        for (double i = min; i < max; i++) {
            double abs = Math.abs(i); //绝对数
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有： " + count);*/
    }
}
