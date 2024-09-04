package thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket1 extends Thread{

    static int sale = 0;
    static int ticketNum = 1000;

    // 可重入锁，多个线程共用同一个 lock
    private static ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                // 锁定对共享资源的调用
                lock.lock();
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + " 售票，票号为：" + ticketNum);
                    ticketNum--;
                    sale++;
                }
                if (ticketNum <= 0) {
                    flag = false;
                }
            }finally {
                // 释放对共享资源的锁定
                lock.unlock();
            }
        }
    }
}
