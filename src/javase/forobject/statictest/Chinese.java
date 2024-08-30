package javase.forobject.statictest;

public class Chinese {

    // 非静态变量
    String name;
    int age;

    // 静态变量
    private static String nation;

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 类可以调用静态方法，但是不能调用非静态方法
     * 对象可以调用静态方法和非静态方法
     *
     * 静态方法中可以调用静态的属性和静态的方法
     * 但是不能调用非静态的属性和方法
     * static 修饰的方法内不能使用 this、super
     *
     * 非静态的方法能调用静态方法和非静态方法
     *
     * 考虑类的属性是否被多个对象共享，可以将其设置为静态方法
     */
}
