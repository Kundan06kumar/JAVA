public class ReverseAlphabets {
    public static void main(String[] args) {
        String s = "a1b2c3";

        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while(l < r) {
            if(!Character.isLetter(arr[l])) l++;
            else if(!Character.isLetter(arr[r])) r--;
            else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++; r--;
            }
        }

        System.out.println(new String(arr));
    }
}

