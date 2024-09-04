package thread.producerandcustomer;

public class Producer extends Thread{

    private Clerk clerk;

    // 和消费者共用一个 cleck
    public Producer(Clerk clerk, String name) {
        this.clerk = clerk;
        this.setName(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产>>>>");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();

        }
    }
}
