package javase.forobject.gouzhao;

public class User {

    // 属性（实例变量）

    public int age = 1;

    public int high;

    public String name;

    public User() {};

    public User(int age, int high, String name) {
        this.age = age;
        this.high = high;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", high=" + high +
                ", name='" + name + '\'' +
                '}';
    }
}
