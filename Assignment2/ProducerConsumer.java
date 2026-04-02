import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    static Queue<Integer> queue = new LinkedList<>();
    static final int LIMIT = 5;

    static class Producer extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                synchronized (queue) {
                    while (queue.size() == LIMIT) {
                        try {
                            queue.wait();
                        } catch (Exception e) {}
                    }
                    queue.add(i);
                    System.out.println("Produced: " + i);
                    queue.notifyAll();
                }
            }
        }
    }

    static class Consumer extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (Exception e) {}
                    }
                    System.out.println("Consumed: " + queue.poll());
                    queue.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }
}
