package javase.forobject.duotai.duotai2;

public class AnimalTest {

    // 领养动物
    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
        // animal.voice(); 只能调 父类 拥有的方法
    }


    public static void main(String[] args) {

        AnimalTest animalTest = new AnimalTest();
        animalTest.adopt(new Dog());
        animalTest.adopt(new Cat());


    }
}
