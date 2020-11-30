package study.day06.demo02;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("Calling " + who);
    }
    public void sendMessage(){
        System.out.println("group message");
    }

}
