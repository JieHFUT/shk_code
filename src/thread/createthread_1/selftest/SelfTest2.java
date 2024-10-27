package thread.createthread_1.selftest;

public class SelfTest2 extends Thread {

    int i = 10_000_000;
    @Override
    public void run() {
        for (int j = 0; j < 5_000_000; j++) {
            i--;
        }
        System.out.println("i = " + i);
    }
}
