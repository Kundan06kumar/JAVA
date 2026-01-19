class AnagramCheck {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
