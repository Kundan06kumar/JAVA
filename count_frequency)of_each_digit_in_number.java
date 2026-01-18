class DigitFrequency {
    public static void main(String[] args) {
        int num = 122333;
        int[] freq = new int[10];

        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
        }
    }
}
