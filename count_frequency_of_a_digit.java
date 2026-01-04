public class DigitFrequency {
    public static void main(String[] args) {
        int num = 5552385;
        int digitToFind = 5;
        int count = 0;

        while(num != 0) {
            if(num % 10 == digitToFind)
                count++;
            num = num / 10;
        }

        System.out.println("Frequency: " + count);
    }
}
