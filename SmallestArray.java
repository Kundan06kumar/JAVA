public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {42, 15, 8, 23, 4};
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
    }
}
