package javase.forobject.thisdemo.test;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        // this 当前正在创建的对象
        this.name = name;
        this.age = age;
    }

    /**
     * 当形参名和属性名字一样的时候，需要使用 this 关键字, 可以使用 this 调用成员变量和方法,构造器
     * this 代表的是谁调用这个方法，this就是谁,如 person1（该引用对象，相当于该引用对象的地址）
     * @param age
     */
    public void setAge(int age) {
        // this 当前对象
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
