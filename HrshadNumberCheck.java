public class HarshadNumber {
    public static void main(String[] args) {
        int n = 18, sum = 0, temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}
