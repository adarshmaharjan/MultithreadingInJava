package basicMultithreading;

public class ExtendsThreadExample {
    public static void main(String[] args) {

    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Thread1: " + i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Thread2: " + i);
        }
    }
}
