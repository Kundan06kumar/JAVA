import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    public static void main(String[] args) {
        Map<String, String> urls = new HashMap<>();

        String shortUrl = "java.ly/abc123";
        String originalUrl = "https://www.example.com/java-tutorial";

        urls.put(shortUrl, originalUrl);

        System.out.println("Short URL: " + shortUrl);
        System.out.println("Original URL: " + urls.get(shortUrl));
    }
}