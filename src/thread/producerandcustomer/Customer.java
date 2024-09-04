package thread.producerandcustomer;

public class Customer extends Thread {

    private Clerk clerk;

    public Customer(Clerk clerk, String name) {
        this.clerk = clerk;
        this.setName(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费>>>>>");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minProduct();
        }

    }
}
