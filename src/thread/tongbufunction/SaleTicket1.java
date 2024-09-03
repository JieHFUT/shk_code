package thread.tongbufunction;

public class SaleTicket1 extends Thread{

    static int sale = 0;
    static boolean flag = true;
    static int ticketNum = 1000;
    @Override
    public void run() {
        saleTicket();
    }

//    public synchronized void saleTicket(){ // 此时同步监视器是 this ，有三个，不安全
//        while (flag) {
//            if (ticketNum > 0) {
//                System.out.println(Thread.currentThread().getName() + " 售票，票号为：" + ticketNum);
//                ticketNum--;
//                sale++;
//            }
//            if (ticketNum <= 0) {
//                flag = false;
//            }
//        }
//    }


//    public static synchronized void saleTicket(){ // 此时同步监视器是当前类本身，SaleTicket1.class，可以
//        while (flag) {
//            if (ticketNum > 0) {
//                System.out.println(Thread.currentThread().getName() + " 售票，票号为：" + ticketNum);
//                ticketNum--;
//                sale++;
//            }
//            if (ticketNum <= 0) {
//                flag = false;
//            }
//        }
//    }


    public static synchronized void saleTicket(){ // 此时同步监视器是当前类本身，SaleTicket1.class，可以
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
