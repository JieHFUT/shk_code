package thread.testthreadsafe;

public class WindowTest {

    public static void main(String[] args) {

        SaleTicket saleTicket = new SaleTicket();

        Thread thread1 = new Thread(saleTicket,"windows-1");
        Thread thread2 = new Thread(saleTicket,"windows-2");
        Thread thread3 = new Thread(saleTicket,"windows-3");
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("卖出去的票一共有: " + saleTicket.sale + " 张");

    }

}
