package javase.forobject.duotai.duotai1;

public class PersonTest {

    public static void main(String[] args) {

        // 多态之前的场景
        Person p = new Person();
        Man m = new Man();
        Women w = new Women();

        // 多态
        Person man = new Man();
        Person women = new Women();
        // 多态的调用: 虚方法调用（在编译的时候认为是父类的类型的方法，执行的时候实际执行的是子类的重写的方法）
        // 多态只适用于方法调用，不适合属性
        man.eat();
        women.eat();










    }
}
