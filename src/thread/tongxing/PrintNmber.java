package thread.tongxing;

public class PrintNmber implements Runnable{

    private int number = 1;

    public int getCount() {
        return count;
    }

    private int count = 0;

    @Override
    public void run() {
        while (true) {
//            synchronized (this) {
//                if (number <= 100) {
//                    System.out.println(Thread.currentThread().getName() + ": " + number);
//                    number++;
//                    count++;
//                }else {
//                    break;
//                }
//            }


            synchronized (this) {
                notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    count++;
                }else {
                    break;
                }

                try {
                    wait(); // 线程一旦执行该方法，就会进入等待状态，同时会释放对同步监视器的调用
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
