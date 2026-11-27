import java.util.UUID;

public class QRDataGenerator {
    public static void main(String[] args) {
        String data = "https://example.com/payment";

        String qrId = UUID.randomUUID().toString();

        System.out.println("QR ID: " + qrId);
        System.out.println("Stored Data: " + data);
    }
}