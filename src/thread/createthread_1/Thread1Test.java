package thread.createthread_1;

public class Thread1Test {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        // 启动线程
        /**
         * 如果这里使用 run()来启动线程，是启动不了的，相当于两次都在 main 线程里执行
         */
        thread1.start();

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "* ");
            }
        }
        System.out.println(Thread.currentThread().getName());

    }
}
