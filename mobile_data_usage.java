public class MobileDataUsage {
    public static void main(String[] args) {
        double usedGB = 1.8;
        double limitGB = 2.0;

        if (usedGB >= limitGB)
            System.out.println("Daily Limit Reached");
        else
            System.out.println("Remaining: " + (limitGB - usedGB) + " GB");
    }
}
