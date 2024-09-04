package thread.producerandcustomer;

public class Clerk {

    private int productNum = 0;

    // produce
    public synchronized void addProduct() {
        if (productNum >= 20) {
            // 等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + ": 生产者生产了第 " + productNum + " 个产品.");
            notifyAll();
        }
    }

    // costomer
    public synchronized void minProduct() {
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + ": 消费者消费了第 " + productNum + " 个产品.");
            productNum--;
            notify();
        }
    }



}
