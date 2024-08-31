package javase.block;

public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);

        Order order1 = new Order(10);

    }
}

//   先代码块，后构造器（代码块和显式赋值是谁在前谁先赋值）
class Order{

    int orderId = 1;


    public Order() {
    }

    public Order(int orderId) {
        this.orderId = orderId;
    }

    {
        orderId = 3;
    }



}