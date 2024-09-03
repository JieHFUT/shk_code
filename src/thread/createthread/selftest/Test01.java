package thread.createthread.selftest;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {

        SelfTest1 selfTest1 = new SelfTest1();
        Thread thread1 = new Thread(selfTest1);
        Thread thread2 = new Thread(selfTest1);

        thread1.start(); // i = 5305375
        thread2.start(); // i = 4922244

    }
}
