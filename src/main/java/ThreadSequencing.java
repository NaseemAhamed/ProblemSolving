import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadSequencing {

    public static class TaskUnderTest implements Callable {
        private String input;
        private Thread predecessor;

        TaskUnderTest(String input) {
            this.input = input;
        }

        @Override
        public String call() {
            if (predecessor != null) {
                try {
                    predecessor.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return input;
        }

        public void setPredecessor(Thread t) {
            this.predecessor = t;
        }
    }

    public  List<Object> driverFunction() throws ExecutionException, InterruptedException {
        TaskUnderTest task1 = new TaskUnderTest("T1");
        TaskUnderTest task2 = new TaskUnderTest("T2");
        TaskUnderTest task3 = new TaskUnderTest("T3");
        FutureTask future1 = new FutureTask(task1);
        FutureTask future2 = new FutureTask(task2);
        FutureTask future3 = new FutureTask(task3);


        Thread t1 = new Thread(future1);
        Thread t2 = new Thread(future2);
        Thread t3 = new Thread(future3);
        task2.setPredecessor(t1);
        task3.setPredecessor(t2);

        t1.start();
        t2.start();
        t3.start();
        return Arrays.asList(future1.get(), future2.get(), future3.get());
    }


}
