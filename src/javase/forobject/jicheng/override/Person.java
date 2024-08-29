package javase.forobject.jicheng.override;

public class Person {

//    private;    自己类
//    default;    自己包内
//    protected;  自己包内，其他包内继承类
//    public;     公开的

    // 属性
    private String name;
    private int age;

    public Person() {
        System.out.println("Person()......");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person(String name, int age)......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 方法
    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}
