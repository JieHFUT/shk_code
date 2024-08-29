package javase.forobject.jicheng.override;

public class TestOverride {
    public static void main(String[] args) {

        Student student = new Student();;
        student.eat();
        System.out.println("=========================");
        student.sleep();

        Student student2 = new Student(20,"HFUT");

    }
}
