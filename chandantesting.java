public class ThreeRangeStreak {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 7, 2, 9};

        int count = 3, max = 3;

        for (int i = 3; i < arr.length; i++) {

            int prevMax = Math.max(arr[i-1],
                          Math.max(arr[i-2], arr[i-3]));
            int prevMin = Math.min(arr[i-1],
                          Math.min(arr[i-2], arr[i-3]));

            int currMax = Math.max(arr[i],
                          Math.max(arr[i-1], arr[i-2]));
            int currMin = Math.min(arr[i],
                          Math.min(arr[i-1], arr[i-2]));

            int prevRange = prevMax - prevMin;
            int currRange = currMax - currMin;

            if (currRange > prevRange) {
                count++;
            } else {
                count = 3;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
