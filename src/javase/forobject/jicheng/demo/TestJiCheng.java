package javase.forobject.jicheng.demo;

public class TestJiCheng {
    public static void main(String[] args) {

        // 构造器无法参与继承
        // 继承并不会影响封装性，父类封装的属性在子类中也不能直接调用，需要通过 getter 和 setter 方法访问
        Person person = new Person();
        System.out.println("age is " + person.getAge());
        person.eat();
        person.sleep();

        Student student = new Student();
        System.out.println("student name is " + student.getName());
        student.eat();
        student.goToSchool();


    }
}
