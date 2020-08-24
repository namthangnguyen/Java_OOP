class JoinThread extends Thread {
    private String threadName;
    private int count;

    public JoinThread(String threadName, int count) {
        this.threadName = threadName;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            System.out.println("Hello from " + this.threadName + " " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) { }
        }
        System.out.println("\n==> Thread " + threadName + " end!\n");
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("==> Main thread starting..\n");

        Thread joinThreadA = new JoinThread("A*", 2);
        Thread joinThreadB = new JoinThread("B*", 3);

        // Thread thông thường, sẽ không sử dụng join().
        Thread noJoinThreadC = new JoinThread("C*", 5);

        joinThreadA.start();
        joinThreadB.start();
        noJoinThreadC.start();
        // Sử dụng join()
        joinThreadA.join();
        joinThreadB.join();

        // Đoạn code dưới đây sẽ phải chờ cho tới khi 2 joinThread A và B hoàn thành, mới được chạy tiếp.
        System.out.println("Hello from main thread...");

        System.out.println("Thread A isLive? " + joinThreadA.isAlive());
        System.out.println("Thread B isLive? " + joinThreadB.isAlive());
        System.out.println("Thread C isLive? " + noJoinThreadC.isAlive());

        System.out.println("\n==> Main Thread end!\n");
    }
}
