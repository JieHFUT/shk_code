package thread.createthread;

public class Thread2 implements Runnable{


    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}