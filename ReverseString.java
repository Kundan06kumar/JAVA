public class ReverseString {
    public static void main(String[] args) {
        String text = "Kundan";
        String rev = "";

        for(int i = text.length()-1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        System.out.println("Reverse: " + rev);
    }
}
