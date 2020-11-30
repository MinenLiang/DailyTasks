package study.day06.demo02;

public class Demo03PhoneSame {
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

        System.out.println("=========");
        Phone phone2 = phone;
        System.out.println(phone2.brand);//null
        System.out.println(phone2.price);//0.0
        System.out.println(phone2.color);//null
        System.out.println("=========");

        phone2.brand = "Samsung";
        phone2.price = 6666.6;
        phone2.color = "White";
        System.out.println(phone2.brand);//Apple
        System.out.println(phone2.price);//8888.3
        System.out.println(phone2.color);//Gold
        System.out.println("=========");

        phone2.call("Oppo");
        phone2.sendMessage();

    }
}
