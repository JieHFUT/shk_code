package thread.createthread_1.selftest;

public class Test02 {

    public static void main(String[] args) {

        SelfTest2 selfTest2 = new SelfTest2();
        selfTest2.start(); // i = 5000000
        SelfTest2 selfTest21 = new SelfTest2();
        selfTest21.start(); // i = 5000000

    }
}
