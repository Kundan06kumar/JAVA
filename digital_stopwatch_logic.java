public class Stopwatch {
    public static void main(String[] args)
            throws InterruptedException {

        for (int seconds = 1; seconds <= 10; seconds++) {
            System.out.println("Elapsed: " + seconds + " seconds");
            Thread.sleep(1000);
        }

        System.out.println("Stopwatch finished!");
    }
}
