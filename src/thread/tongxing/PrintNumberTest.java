package thread.tongxing;

public class PrintNumberTest {

    public static void main(String[] args) {


        PrintNmber printNumber = new PrintNmber();
        Thread thread1 = new Thread(printNumber,"thread-1");
        thread1.start();

        Thread thread2 = new Thread(printNumber,"thread-2");
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("一共有： " + printNumber.getCount());

    }
}
