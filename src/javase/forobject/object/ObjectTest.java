package javase.forobject.object;

import javase.forobject.object.Person;

public class ObjectTest {


    /**
     * java.lang 包下的 Object 类
     * Object()
     *
     * protected Object
     * clone()
     * 创建并返回此对象的副本。
     * boolean
     * equals(Object obj)
     * 指示某个其他对象是否“等于”这个对象。
     * protected void
     * finalize()
     * 已弃用。
     * 终结机制本质上是有问题的。
     * final Class<?>
     * getClass()
     * 返回此 Object 的运行时类。
     * int
     * hashCode()
     * 返回对象的哈希码值。
     * final void
     * notify()
     * 唤醒在此对象的监视器上等待的单个线程。
     * final void
     * notifyAll()
     * 唤醒在此对象的监视器上等待的所有线程。
     * String
     * toString()
     * 返回对象的字符串表示形式。
     * final void
     * wait()
     * 导致当前线程等待直到被唤醒，通常是 notified 或 interrupted 。
     * final void
     * wait(long timeoutMillis)
     * 导致当前线程等待直到它被唤醒，通常是被 notified 或 interrupted 唤醒，或者直到经过一定的实时时间。
     * final void
     * wait(long timeoutMillis, int nanos)
     * 导致当前线程等待直到它被唤醒，通常是被 notified 或 interrupted 唤醒，或者直到经过一定的实时时间。
     */
    public static void main(String[] args) {

        Person person = new Person();
        person.age = 18;
        try {
            Person person1 = (Person) person.clone();
            System.out.println("person1.age = " + person1.age);
            System.out.println(person == person1);         // false
            System.out.println(person.equals(person1));    // false
            // Object 中的 equals 是直接判断地址值是否相等
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        // 类似String类就重写了equals()方法，自己写的类可以利用 IDE 自动生成
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));









    }

}
