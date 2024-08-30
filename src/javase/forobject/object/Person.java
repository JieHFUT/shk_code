package javase.forobject.object;

public class Person implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println("person eat pork");
    }
    public void walk(){
        System.out.println("person walk in road");
    }
}
