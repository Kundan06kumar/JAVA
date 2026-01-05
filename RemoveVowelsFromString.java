public class RemoveVowels {
    public static void main(String[] args) {
        String text = "Programming";
        String result = "";

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
               ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
