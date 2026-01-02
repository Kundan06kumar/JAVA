public class RotateNumber {
    public static void main(String[] args) {
        int num = 12345;
        int k = 2;

        String s = Integer.toString(num);
        k %= s.length();

        String rotated = s.substring(k) + s.substring(0, k);
        System.out.println("Rotated Number: " + rotated);
    }
}
