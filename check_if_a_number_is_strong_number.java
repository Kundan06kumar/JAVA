class StrongNumber {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static void main(String[] args) {
        int num = 145, temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }

        System.out.println(sum == num ? "Strong Number" : "Not Strong");
    }
}
