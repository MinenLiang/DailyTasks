package study.day07.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("玛尔扎哈",38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

//        Person person = array[1];
        System.out.println(array[1].getName());

    }
}
