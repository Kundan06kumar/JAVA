public class NearestPrime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int num = 20;

        int lower = num - 1;
        int upper = num + 1;

        while (!isPrime(lower)) lower--;
        while (!isPrime(upper)) upper++;

        System.out.println("Nearest Prime: " +
            (num - lower <= upper - num ? lower : upper));
    }
}
