public class CoPrime {
    static int gcd(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 14, y = 25;
        System.out.println(gcd(x, y) == 1);
    }
}
