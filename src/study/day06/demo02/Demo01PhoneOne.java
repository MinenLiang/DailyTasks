package study.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand);//null
        System.out.println(phone.price);//0.0
        System.out.println(phone.color);//null
        System.out.println("=========");

        phone.brand = "Apple";
        phone.price = 8888.3;
        phone.color = "Gold";
        System.out.println(phone.brand);//Apple
        System.out.println(phone.price);//8888.3
        System.out.println(phone.color);//Gold
        System.out.println("=========");

        phone.call("Joe");
        phone.sendMessage();

    }
}
