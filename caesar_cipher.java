public class CaesarCipher {
    public static void main(String[] args) {
        String text = "Hello Java";
        int shift = 3;
        StringBuilder encrypted = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                encrypted.append((char) ('A' + (ch - 'A' + shift) % 26));
            } else if (ch >= 'a' && ch <= 'z') {
                encrypted.append((char) ('a' + (ch - 'a' + shift) % 26));
            } else {
                encrypted.append(ch);
            }
        }

        System.out.println(encrypted);
    }
}
