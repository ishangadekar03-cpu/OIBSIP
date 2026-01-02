public class Timer extends Thread {
    private int time;
    private boolean timeUp = false;

    public Timer(int time) {
        this.time = time;
    }

    public void run() {
        try {
            Thread.sleep(time * 1000);
            timeUp = true;
            System.out.println("\nTime is up! Auto submitting exam...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isTimeUp() {
        return timeUp;
    }
}
