package javase.forobject.jicheng.override;

public class Student extends Person {

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void goToSchool() {
        System.out.println(this.getAge() + " 岁的 " + this.getName() + " go to school");
    }

    /**
     * 在这个地方对父类中的方法进行重写
     * 重写的时候与父类中的方法名和参数列表必须相同
     * 子类重写的方法的权限修饰符不小于父类的权限修饰符
     * 子类是不能重写父类中权限为 private 的方法的
     *
     * 如果父类被重写的方法的返回值类型是 void，那么子类的返回值也需为 void
     * 如果如果父类被重写的方法的返回值类型是基本数据类型，那么子类的返回值也需为一样的
     * 如果父类被重写的方法的返回值类型是引用数据类型，那么子类的返回值可以与父类的返回值类型相同或者为其子类
     *
     * 子类重写的方法抛出的异常类型可以与父类抛出的异常相同，也可以是父类抛出异常的子类
     */
    @Override
    public void eat() {
        System.out.println("现在学生不仅仅要吃饱，还要吃的好！");
    }


}
