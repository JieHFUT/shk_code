package thread.producerandcustomer;

public class ProducerAndCustomerTest {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer producer1 = new Producer(clerk, "生产者1");
        Customer customer1 = new Customer(clerk, "消费者1");
        Customer customer2 = new Customer(clerk, "消费者2");

        producer1.start();
        customer2.start();
        customer1.start();

    }
}
