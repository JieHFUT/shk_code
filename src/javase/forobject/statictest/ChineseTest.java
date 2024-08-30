package javase.forobject.statictest;

public class ChineseTest {

    public static void main(String[] args) {

        Chinese.setNation("china");
        System.out.println("nation is " + Chinese.getNation());

        Chinese chinese1 = new Chinese();
        chinese1.age = 40;
        chinese1.name = "zhangsan";


        Chinese chinese2 = new Chinese();
        chinese2.age = 20;
        chinese2.name = "lisi";


    }
}
