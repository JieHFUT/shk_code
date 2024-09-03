package thread.testthreadsafe;

public class SaleTicket implements Runnable {

    int sale = 0;
    int ticketNum = 100;
    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            synchronized (this) {
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

