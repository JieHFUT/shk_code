package thread.tongbufunction;

public class SaleTicket implements Runnable {

    int sale = 0;
    int ticketNum = 1000;
    @Override
    public void run() {
        saleTicket();
    }



    public synchronized void saleTicket() { // 此时的同步监视器是 this
        boolean flag = true;
        while (flag) {
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

