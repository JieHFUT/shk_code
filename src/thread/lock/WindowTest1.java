package thread.lock;

public class WindowTest1 {

    public static void main(String[] args) {


        SaleTicket1 saleTicket1 = new SaleTicket1();
        saleTicket1.start();

        SaleTicket1 saleTicket2 = new SaleTicket1();
        saleTicket2.start();

        SaleTicket1 saleTicket3 = new SaleTicket1();
        saleTicket3.start();


        try {
            saleTicket1.join();
            saleTicket2.join();
            saleTicket3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("卖出去的票一共有: " + SaleTicket1.sale + " 张");


    }
}
