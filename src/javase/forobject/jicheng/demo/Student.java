package javase.forobject.jicheng.demo;

public class Student extends Person {

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void goToSchool() {
        System.out.println(this.getAge() + " 岁的 "+ this.getName() +" go to school");
    }
}
