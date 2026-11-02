public class ThreadRace {
    public static void main(String[] args) throws InterruptedException {
        Runnable racer = () -> {
            String name = Thread.currentThread().getName();

            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " reached step " + i);
            }
        };

        Thread t1 = new Thread(racer, "Racer A");
        Thread t2 = new Thread(racer, "Racer B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both racers finished!");
    }
}