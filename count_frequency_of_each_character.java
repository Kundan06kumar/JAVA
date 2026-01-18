class CharFrequency {
    public static void main(String[] args) {
        String s = "programming";
        boolean[] visited = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(s.charAt(i) + " : " + count);
        }
    }
}
