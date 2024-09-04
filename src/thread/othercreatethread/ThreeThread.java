package thread.othercreatethread;

import java.util.concurrent.Callable;

public class ThreeThread implements Callable {


    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
            Thread.sleep(1000);
        }
        return sum;
    }
}
