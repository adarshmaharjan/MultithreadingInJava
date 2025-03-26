package basicMultithreading;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // * example
        // thredExecutionExample();

        //
        setExecutingThreadPriority();
    }

    static void thredExecutionExample() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

    }

    static void setExecutingThreadPriority() {
        System.out.println(Thread.currentThread().getName() + " says HI");
        Thread one = new Thread(() -> {
            System.out.println("Thread one says hi also");
        });
        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
    }
}
