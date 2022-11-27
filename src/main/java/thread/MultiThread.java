package thread;

public class MultiThread extends Thread {

    private int threadNumber;

    public MultiThread(int number) {
        this.threadNumber = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From thread " + this.threadNumber + " - " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
