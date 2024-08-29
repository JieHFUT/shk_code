package javase.forobject.duotai.duotai2;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("cat eat bone");
    }

    @Override
    public void jump() {
        System.out.println("cat jump");
    }

    public void voice() {
        System.out.println("喵喵喵");
    }
}
