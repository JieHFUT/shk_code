package thread.createthread;

/**
 * ClassName: TestCreateThread
 * Package: thread.createthread
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 15:24
 * @Version 1.0
 */
public class TestCreateThread {
    public static void main(String[] args) {

        // 创建继承 thread 类的线程1的实例
        ExtendThread thread1 = new ExtendThread();
        // 通过对象调用 start() 启动线程
        thread1.start();

        /**
         * 注意不能使用 run() 方法来启动线程，这是对线程什么时候开始调度，是计算机操作系统的问题
         * 使用 run() 方法不会启动线程，只是普通的在 main 线程里调用其他类的方法
         *
         * 已经启动的线程不能再次执行 start() 方法，否则会报 IllegalThreadStateException 错
         */
        // 在 main 线程里创建一个打印 1-100 奇数的操作
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }



    }
}
