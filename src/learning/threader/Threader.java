class HelloThread extends Thread {
    // Code trong hàm run() sẽ được thực thi khi thread được chạy (start)
    @Override
    public void run() {
        int index = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("  - HelloThread running " + index++);
            try {
                Thread.sleep(1030);
            } catch (InterruptedException e) { }
        }
        System.out.println("  - ==> HelloThread stopped");
    }
}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        int idx = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from RunnableDemo " + idx++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) { }
        }
    }
}

public class Threader {
    public static void main(String[] args) throws InterruptedException {
        int idx = 1;
        for (int i = 0; i < 2; i++) {
            System.out.println("Main thread running " + idx++);
            Thread.sleep(2101);
        }

        HelloThread helloThread = new HelloThread(); // Khởi tạo thread, lúc này thread ở trạng thái NEW
        // Chạy thread
        helloThread.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread running " + idx++);
            Thread.sleep(2101);
        }

        System.out.println("==> Main thread stopped");
    }
}
