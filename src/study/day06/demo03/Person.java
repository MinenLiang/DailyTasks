package study.day06.demo03;

public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("My name is " + name + " age: " + age);
    }

    public void setAge(int num){
        if(num < 100 && num >= 0){
            age = num;
        }else{
            System.out.println("Incorrect input!");
        }

    }

    public int getAge(){
        return age;
    }
}
