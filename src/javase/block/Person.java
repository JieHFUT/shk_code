package javase.block;

public class Person {

    String name;
    int age;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 代码快 (静态、非静态)
    {
        System.out.println("非静态代码快");
    }
    static {
        System.out.println("静态代码快");
    }
}
