package week1.solution;

import lombok.Getter;

@Getter
class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

@Getter
class Human extends People {
    private String account;

    public Human(String name, int age, String account) {
        super(name, age);
        this.account = account;
    }
}
public class Reference{
    public static void main(String[] args) {
        Human human = new Human("완규", 28, "1234123412341");

        People people = (People) human;
        System.out.println(people.getAge());
        System.out.println(people.getName());
        // 업캐스팅을 했기 때문에 account에 접근이 불가능합니다.
        // System.out.println(people.getAccount());
        
        Human human2 = (Human) people;
        System.out.println(human2.getAge());
        System.out.println(human2.getName());
        System.out.println(human2.getAccount());
    }

}
