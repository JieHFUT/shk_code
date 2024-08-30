package javase.main;

public class MainTest {
    static String[] str = new String[]{"aa","bb","cc","dd","ee"};

    public static void main(String[] args) {
        Test.main(str);
    }
}


class Test{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
