package javase.forobject.thisdemo;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("mask",1);
        person1.setAge(18);

        System.out.println(person1.toString());
    }
}
