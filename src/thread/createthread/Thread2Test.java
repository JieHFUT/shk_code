package thread.createthread;

public class Thread2Test {

    public static void main(String[] args) {

        Thread2 thread2 = new Thread2();

        new Thread(thread2).start();
        new Thread(thread2).start();

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "* ");
            }
        }
        System.out.println(Thread.currentThread().getName());

    }

}
