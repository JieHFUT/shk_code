package thread.lock;

public class WindowTest {

    public static void main(String[] args) {

        SaleTicket saleTicket = new SaleTicket();

        new Thread(saleTicket).start();
        new Thread(saleTicket).start();
        new Thread(saleTicket).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("卖出去的票一共有: " + saleTicket.sale + " 张");


    }

}
