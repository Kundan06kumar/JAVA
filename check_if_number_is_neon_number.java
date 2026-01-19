class NeonNumber {
    public static void main(String[] args) {
        int num = 9;
        int sq = num * num;
        int sum = 0;

        while (sq != 0) {
            sum += sq % 10;
            sq /= 10;
        }

        System.out.println(sum == num ? "Neon Number" : "Not Neon");
    }
}
