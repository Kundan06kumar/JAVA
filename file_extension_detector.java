public class FileExtension {
    public static void main(String[] args) {
        String filename = "project.java";

        int dot = filename.lastIndexOf('.');

        if (dot > 0 && dot < filename.length() - 1) {
            System.out.println(
                    "Extension: " + filename.substring(dot + 1)
            );
        } else {
            System.out.println("No extension found");
        }
    }
}
