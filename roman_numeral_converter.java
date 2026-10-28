public class RomanConverter {
    public static void main(String[] args) {
        int number = 1994;

        int[] values = {
                1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1
        };

        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };

        if (number < 1 || number > 3999) {
            System.out.println("Enter a number from 1 to 3999.");
            return;
        }

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }

        System.out.println("Roman numeral: " + roman);
    }
}