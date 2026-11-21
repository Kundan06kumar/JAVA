public class IPValidator {
    public static void main(String[] args) {
        String ip = "192.168.1.10";

        String[] parts = ip.split("\\.", -1);
        boolean valid = parts.length == 4;

        for (String part : parts) {
            if (!part.matches("\\d{1,3}")) {
                valid = false;
                break;
            }

            int value = Integer.parseInt(part);

            if (value < 0 || value > 255 ||
                    (part.length() > 1 && part.startsWith("0"))) {
                valid = false;
                break;
            }
        }

        System.out.println(valid ? "Valid IPv4" : "Invalid IPv4");
    }
}
