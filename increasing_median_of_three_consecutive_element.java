import java.util.Arrays;

public class ThreeMedianStreak {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 6};
        int count = 3, max = 3;

        for (int i = 3; i < arr.length; i++) {

            int[] prevArr = {arr[i-1], arr[i-2], arr[i-3]};
            int[] currArr = {arr[i], arr[i-1], arr[i-2]};

            Arrays.sort(prevArr);
            Arrays.sort(currArr);

            int prev = prevArr[1];
            int curr = currArr[1];

            if (curr > prev)
                count++;
            else
                count = 3;

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
