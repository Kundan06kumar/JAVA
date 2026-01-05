public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 15;
        int lcm = (a > b) ? a : b;

        while(true) {
            if(lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM: " + lcm);
                break;
            }
            lcm++;
        }
    }
}
