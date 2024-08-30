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
        // 多态只适用于方法调用，不适合属性（对属性来说，在编译的时候认为是父类的类型的方法，执行的时候执行的是申明的父类的属性）
        man.eat();
        women.eat();


        /**
         * 多态的弊端
         * Person man = new Man();
         * 针对于创建的对象，在内存中是否加载了 Man 类型中申明的特有的属性与方法？     => （加载了）
         * 问题：能不能直接调用 Man 中加载的特有的属性与方法？    => （不能）
         *
         */






    }
}
