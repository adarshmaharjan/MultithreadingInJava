package threadSynchronisation;

public class SynchronisationDemo {
    public static int counter1 = 0;
    public static int counter2 = 0;

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i += 1) {
                increment1();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i += 1) {
                increment2();
            }
        });

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter 1 value: " + counter1);
        System.out.println("Counter 2 value: " + counter2);
    }

    private synchronized static void increment1() {
        counter1 += 1;
    }

    private synchronized static void increment2() {
        counter2 += 1;
    }
}