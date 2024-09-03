package thread.testthreadsafe;

import java.awt.*;

public class SaleTicket1 extends Thread{

    static Object lock = new Object();
    static int sale = 0;
    static int ticketNum = 1000;
    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            synchronized (SaleTicket1.class) {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + " 售票，票号为：" + ticketNum);
                    ticketNum--;
                    sale++;
                }
                if (ticketNum <= 0) {
                    flag = false;
                }
            }
        }
    }
}
